package guiaturistica.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sandrojc
 */

@Entity
@Table(name = "Restaurant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "restaurant.buscarAll",
            query = "SELECT o FROM Restaurant o"),
    @NamedQuery(name = "restaurant.buscarPorId",
            query = "SELECT o FROM Restaurant o WHERE o.id_restaurant = :id_restaurant"),
    @NamedQuery(name = "Restaurant.buscarPorNombre",
            query = "SELECT o FROM Restaurant o WHERE o.nombreRestaurant = :nombreRestaurant")
})


public class Restaurant implements  Serializable{
    
    @Id
    @Column (name = "id_restaurant")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Long    id_restaurant;
    
    @Column (name = "nombreRestaurant")
    private String  nombreRestaurant;
    
    @Column (name = "direccionRestaurant")
    private String  direccionRestaurant;
   
    @Column (name = "telefonoRestaurant")
    private String  telefonoRestaurant;
   
    @Column (name = "valorPromedioPlato")
    private double  valorPromedioPlato;
    
    //Relación con sitio Muchos a muchos
    @ManyToMany(mappedBy = "restaurant",cascade = CascadeType.ALL, targetEntity = Sitio.class)
    private List<Sitio> sitio;
    
    public Long getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(Long id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public String getDireccionRestaurant() {
        return direccionRestaurant;
    }

    public void setDireccionRestaurant(String direccionRestaurant) {
        this.direccionRestaurant = direccionRestaurant;
    }

    public String getTelefonoRestaurant() {
        return telefonoRestaurant;
    }

    public void setTelefonoRestaurant(String telefonoRestaurant) {
        this.telefonoRestaurant = telefonoRestaurant;
    }

    public double getValorPromedioPlato() {
        return valorPromedioPlato;
    }

    public void setValorPromedioPlato(double valorPromedioPlato) {
        this.valorPromedioPlato = valorPromedioPlato;
    }

    public List<Sitio> getSitio() {
        return sitio;
    }

    public void setSitio(List<Sitio> sitio) {
        this.sitio = sitio;
    }
    
}
