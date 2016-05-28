package guiaturistica.controlador;

import guiaturistica.modelo.Cuenta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author sandrojc
 */

public class CuentaJpaControl implements Serializable {

    public CuentaJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Cuenta cuenta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cuenta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

    // Método para consultar
    public List<Cuenta> buscarCuentaEntidad() {
        return buscarCuentaEntidad(true, -1, -1);
    }

    public List<Cuenta> buscarCuentaEntidad(int maxResultados,
            int minimosResulatados) {
        return buscarCuentaEntidad(false, maxResultados, minimosResulatados);

    }

    private List<Cuenta> buscarCuentaEntidad(boolean all, int maxResulatados,
            int minimosResulatados) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cuenta.class));
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

    //Método actualizar
    //Métodos buscar 
    public Cuenta buscarCuenta(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cuenta.class, id);

        } finally {
            em.close();
        }
    }

    public Cuenta buscarCuentaUser(String user) {
        EntityManager em = getEntityManager();
        boolean all = true;
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cuenta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.getParameterValue(user);
            }
            return (Cuenta) q.getSingleResult();

        } finally {
            em.close();
        }
    }
}