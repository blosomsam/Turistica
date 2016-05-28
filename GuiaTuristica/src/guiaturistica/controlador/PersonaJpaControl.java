package guiaturistica.controlador;

import guiaturistica.modelo.Persona;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author sandrojc
 */
public class PersonaJpaControl implements Serializable {
    
     public  PersonaJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }
     
    private EntityManagerFactory emf = null; 
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     
    public void crear(Persona persona){
        EntityManager em= null;
        try{
            em= getEntityManager();
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        }finally{
            if (em !=null) {
                em.close();                
            }
        } 
    }
    
    //para consultar
    public List<Persona> buscarPersonaEntidad(){
        return buscarPersonaEntidad(true, -1, -1); 
    }
    
    public List<Persona> buscarPersonaEntidad(int maxResultados, 
            int minimosResulatados){
        return  buscarPersonaEntidad(false, maxResultados, minimosResulatados);
    }
    
    private List<Persona> buscarPersonaEntidad(boolean all, 
            int maxResulatados, int minimosResulatados){
        EntityManager em = getEntityManager();
        
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResulatados);
                q.setFirstResult(minimosResulatados);    
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    //metodo actualizar
    
    //metodo buscar por id
    public Persona buscarPersona(long id){
        EntityManager em = getEntityManager();
        try{
            return em.find(Persona.class, id);
        }finally{
            em.close();
        }
    }
}