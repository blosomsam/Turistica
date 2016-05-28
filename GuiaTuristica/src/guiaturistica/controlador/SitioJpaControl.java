package guiaturistica.controlador;

import guiaturistica.modelo.Sitio;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author sandrojc
 */
public class SitioJpaControl implements  Serializable{
        
     public  SitioJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }
     
    private EntityManagerFactory emf = null; 
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     
    public void crear(Sitio sitio){
        EntityManager em= null;
        try{
            em= getEntityManager();
            em.getTransaction().begin();
            em.persist(sitio);
            em.getTransaction().commit();
        }finally{
            if (em !=null) {
                em.close();                
            }
        } 
    }
    
    //para consultar
    public List<Sitio> buscarSitioEntidad(){
        return buscarSitioEntidad(true, -1, -1); 
    }
    
    public List<Sitio> buscarSitioEntidad(int maxResultados, 
            int minimosResulatados){
        return  buscarSitioEntidad(false, maxResultados, minimosResulatados);
    }
    
    private List<Sitio> buscarSitioEntidad(boolean all, 
            int maxResulatados, int minimosResulatados){
        EntityManager em = getEntityManager();
        
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sitio.class));
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
    public Sitio buscarSitio(long id){
        EntityManager em = getEntityManager();
        try{
            return em.find(Sitio.class, id);
        }finally{
            em.close();
        }
    }
}