package guiaturistica.controlador;

import guiaturistica.modelo.Tienda;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author sandrojc
 */
public class TiendaJpaControl implements Serializable {
        
     public  TiendaJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }
     
    private EntityManagerFactory emf = null; 
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     
    public void crear(Tienda tienda){
        EntityManager em= null;
        try{
            em= getEntityManager();
            em.getTransaction().begin();
            em.persist(tienda);
            em.getTransaction().commit();
        }finally{
            if (em !=null) {
                em.close();                
            }
        } 
    }
    
    //para consultar
    public List<Tienda> buscarTiendaEntidad(){
        return buscarTiendaEntidad(true, -1, -1); 
    }
    
    public List<Tienda> buscarTiendaEntidad(int maxResultados, 
            int minimosResulatados){
        return  buscarTiendaEntidad(false, maxResultados, minimosResulatados);
    }
    
    private List<Tienda> buscarTiendaEntidad(boolean all, 
            int maxResulatados, int minimosResulatados){
        EntityManager em = getEntityManager();
        
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tienda.class));
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
    public Tienda buscarTienda(long id){
        EntityManager em = getEntityManager();
        try{
            return em.find(Tienda.class, id);
        }finally{
            em.close();
        }
    }
}