package guiaturistica.controlador;

import guiaturistica.modelo.Hospedaje;
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

public class HospedajeJpaControl implements  Serializable{
    
    public HospedajeJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Hospedaje hospedaje) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(hospedaje);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

    // Método para consultar
    public List<Hospedaje> buscarHospedajeEntidad() {
        return buscarHospedajeEntidad(true, -1, -1);
    }

    public List<Hospedaje> buscarCuentaEntidad(int maxResultados,
            int minimosResulatados) {
        return buscarHospedajeEntidad(false, maxResultados, minimosResulatados);

    }

    private List<Hospedaje> buscarHospedajeEntidad(boolean all, int maxResulatados,
            int minimosResulatados) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Hospedaje.class));
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
    public Hospedaje buscarHospedaje(long id){
        EntityManager em = getEntityManager();
        try{
            return em.find(Hospedaje.class, id);
        }finally{
            em.close();
        }
    }
}
