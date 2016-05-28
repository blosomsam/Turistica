package guiaturistica.controlador;

import guiaturistica.modelo.Ruta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author sandrojc
 */

public class RutaJpaControl implements Serializable {
    
     public  RutaJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }
     
    private EntityManagerFactory emf = null; 
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     
    public void crear(Ruta ruta){
        EntityManager em= null;
        try{
            em= getEntityManager();
            em.getTransaction().begin();
            em.persist(ruta);
            em.getTransaction().commit();
        }finally{
            if (em !=null) {
                em.close();                
            }
        } 
    }
    
    //para consultar
    public List<Ruta> buscarRutaEntidad(){
        return buscarRutaEntidad(true, -1, -1); 
    }
    
    public List<Ruta> buscarRutaEntidad(int maxResultados, 
            int minimosResulatados){
        return  buscarRutaEntidad(false, maxResultados, minimosResulatados);
    }
    
    private List<Ruta> buscarRutaEntidad(boolean all, 
            int maxResulatados, int minimosResulatados){
        EntityManager em = getEntityManager();
        
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ruta.class));
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
    public Ruta buscarRuta(long id){
        EntityManager em = getEntityManager();
        try{
            return em.find(Ruta.class, id);
        }finally{
            em.close();
        }
    }
}