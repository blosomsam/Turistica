/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaturistica.controlador;

import guiaturistica.modelo.Restaurant;
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
public class RestaurantJpaControl implements Serializable{
    
     public  RestaurantJpaControl(EntityManagerFactory emf) {
        this.emf = emf;
    }
     
    private EntityManagerFactory emf = null; 
    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     
    public void crear(Restaurant restaurant){
        EntityManager em= null;
        try{
            em= getEntityManager();
            em.getTransaction().begin();
            em.persist(restaurant);
            em.getTransaction().commit();
        }finally{
            if (em !=null) {
                em.close();                
            }
        } 
    }
    
    //para consultar
    public List<Restaurant> buscarRestaurantEntidad(){
        return buscarRestaurantEntidad(true, -1, -1); 
    }
    
    public List<Restaurant> buscarRestaurantEntidad(int maxResultados, 
            int minimosResulatados){
        return  buscarRestaurantEntidad(false, maxResultados, minimosResulatados);
    }
    
    private List<Restaurant> buscarRestaurantEntidad(boolean all, 
            int maxResulatados, int minimosResulatados){
        EntityManager em = getEntityManager();
        
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Restaurant.class));
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
    public Restaurant buscarRestaurant(long id){
        EntityManager em = getEntityManager();
        try{
            return em.find(Restaurant.class, id);
        }finally{
            em.close();
        }
    }
}