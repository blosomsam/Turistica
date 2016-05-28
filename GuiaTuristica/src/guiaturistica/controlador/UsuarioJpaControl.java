package guiaturistica.controlador;

import guiaturistica.modelo.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author sandrojc
 */

public class UsuarioJpaControl implements Serializable {
    
     public  UsuarioJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }
     
    private EntityManagerFactory emf = null; 
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     
    public void crear(Usuario usuario){
        EntityManager em= null;
        try{
            em= getEntityManager();
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        }finally{
            if (em !=null) {
                em.close();                
            }
        } 
    }
    
    //para consultar
    public List<Usuario> buscarUsuarioEntidad(){
        return buscarUsuarioEntidad(true, -1, -1); 
    }
    
    public List<Usuario> buscarUsuarioEntidad(int maxResultados, 
            int minimosResulatados){
        return  buscarUsuarioEntidad(false, maxResultados, minimosResulatados);
    }
    
    private List<Usuario> buscarUsuarioEntidad(boolean all, 
            int maxResulatados, int minimosResulatados){
        EntityManager em = getEntityManager();
        
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
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
    public Usuario buscarPersona(long id){
        EntityManager em = getEntityManager();
        try{
            return em.find(Usuario.class, id);
        }finally{
            em.close();
        }
    }
}