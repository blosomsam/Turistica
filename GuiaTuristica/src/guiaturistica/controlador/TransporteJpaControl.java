package guiaturistica.controlador;

import guiaturistica.modelo.Transporte;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author sandrojc
 */

public class TransporteJpaControl implements Serializable {
    
     public  TransporteJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }
     
    private EntityManagerFactory emf = null; 
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     
    public void crear(Transporte transporte){
        EntityManager em= null;
        try{
            em= getEntityManager();
            em.getTransaction().begin();
            em.persist(transporte);
            em.getTransaction().commit();
        }finally{
            if (em !=null) {
                em.close();                
            }
        } 
    }
    
    //para consultar
    public List<Transporte> buscarPersonaEntidad(){
        return buscarPersonaEntidad(true, -1, -1); 
    }
    
    public List<Transporte> buscarPersonaEntidad(int maxResultados, 
            int minimosResulatados){
        return  buscarPersonaEntidad(false, maxResultados, minimosResulatados);
    }
    
    private List<Transporte> buscarPersonaEntidad(boolean all, 
            int maxResulatados, int minimosResulatados){
        EntityManager em = getEntityManager();
        
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Transporte.class));
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
    public Transporte buscarTransporte(long id){
        EntityManager em = getEntityManager();
        try{
            return em.find(Transporte.class, id);
        }finally{
            em.close();
        }
    }
}