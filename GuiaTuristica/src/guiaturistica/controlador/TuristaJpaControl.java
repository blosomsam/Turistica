package guiaturistica.controlador;

import guiaturistica.modelo.Turista;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author sandrojc
 */

public class TuristaJpaControl implements Serializable {
    
     public  TuristaJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }
     
    private EntityManagerFactory emf = null; 
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     
    public void crear(Turista turista){
        EntityManager em= null;
        try{
            em= getEntityManager();
            em.getTransaction().begin();
            em.persist(turista);
            em.getTransaction().commit();
        }finally{
            if (em !=null) {
                em.close();                
            }
        } 
    }
    
    //para consultar
    public List<Turista> buscarTuristaEntidad(){
        return buscarTuristaEntidad(true, -1, -1); 
    }
    
    public List<Turista> buscarTuristaEntidad(int maxResultados, 
            int minimosResulatados){
        return  buscarTuristaEntidad(false, maxResultados, minimosResulatados);
    }
    
    private List<Turista> buscarTuristaEntidad(boolean all, 
            int maxResulatados, int minimosResulatados){
        EntityManager em = getEntityManager();
        
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Turista.class));
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
    public Turista buscarTurista(long id){
        EntityManager em = getEntityManager();
        try{
            return em.find(Turista.class, id);
        }finally{
            em.close();
        }
    }
}