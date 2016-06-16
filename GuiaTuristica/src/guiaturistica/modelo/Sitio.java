package guiaturistica.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sandrojc
 */

@Entity
@Table(name ="Sitio")
@XmlRootElement
@NamedQueries({
      @NamedQuery(name="sitio.buscarAll", 
              query ="SELECT o FROM Sitio o"),
      @NamedQuery(name="sitio.buscarPorId", 
              query ="SELECT o FROM Sitio o WHERE o.id_sitio = :id_sitio"),
      @NamedQuery(name="sitio.buscarPorNombre", 
              query ="SELECT o FROM Sitio o WHERE o.nombreSitio = :nombreSitio"),
      @NamedQuery(name="sitio.buscarPorServicios", 
              query ="SELECT o FROM Sitio o WHERE o.descripcionSitio = :descripcionSitio")
      })

public class Sitio implements  Serializable {
    
    @Id 
    @Column(name = "id_sitio")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_sitio;

    @Column(name = "nombreSitio")
    private String nombreSitio;
    
    @Column(name = "DireccionSitio")
    private String DireccionSitio;

    @Column(name = "descripcionSitio")
    private String descripcionSitio;

    @Column(name = "distanciaSitio")
    private String distanciaSitio;

    @Column(name = "serviciosSitio")
    private String serviciosSitio;

    @Column(name = "telefonoCasaSitio")
    private String telefonoCasaSitio;

    @Column(name = "telefonoCelularSitio")
    private String telefonoCelularSitio;

    @Column(name = "climaSitio")
    private String climaSitio;

    @Column(name = "caracteristicasSitio")
    private String caracteristicasSitio;  
    
    
    //RELACIONES ENTRE  CLASES
    
    //Relación con persona @ManyToOne 
    @ManyToOne
    private Persona persona;
    
    //Relación con restaurant @ManyToMany
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Sitio_Restaurant", joinColumns = @JoinColumn(name = "id_sitio", referencedColumnName = "id_sitio"),
            inverseJoinColumns = @JoinColumn(name = "id_restaurant", referencedColumnName = "id_restaurant"))
    private List<Restaurant> restaurant;
    
    //Relación con Rutas @ManyToMany
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Sitio_Ruta", joinColumns = @JoinColumn(name = "id_sitio", referencedColumnName = "id_sitio"),
            inverseJoinColumns = @JoinColumn(name = "id_ruta", referencedColumnName = "id_ruta"))
    private List<Ruta> ruta;
    
    //Relación con Hospedaje @ManyToMany
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Sitio_Tienda", joinColumns = @JoinColumn(name = "id_sitio", referencedColumnName = "id_sitio"),
            inverseJoinColumns = @JoinColumn(name = "id_tienda", referencedColumnName = "id_tienda"))
    private List<Tienda> tienda;
    
    //Relación con Rutas @ManyToMany
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Sitio_Transporte", joinColumns = @JoinColumn(name = "id_sitio", referencedColumnName = "id_sitio"),
            inverseJoinColumns = @JoinColumn(name = "id_transporte", referencedColumnName = "id_transporte"))
    private List<Transporte> transporte;
    
    //Relación con Hospedaje @ManyToMany
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Sitio_Hospedaje", joinColumns = @JoinColumn(name = "id_sitio", referencedColumnName = "id_sitio"),
            inverseJoinColumns = @JoinColumn(name = "id_hospedaje", referencedColumnName = "id_hospedaje"))
    private List<Hospedaje> hospedaje;

    //MÉTODOS SET Y GET
    public Long getId_sitio() {
        return id_sitio;
    }

    public void setId_sitio(Long id_sitio) {
        this.id_sitio = id_sitio;
    }

    public String getNombreSitio() {
        return nombreSitio;
    }

    public void setNombreSitio(String nombreSitio) {
        this.nombreSitio = nombreSitio;
    }

    public String getDescripcionSitio() {
        return descripcionSitio;
    }

    public void setDescripcionSitio(String descripcionSitio) {
        this.descripcionSitio = descripcionSitio;
    }

    public String getDistanciaSitio() {
        return distanciaSitio;
    }

    public void setDistanciaSitio(String distanciaSitio) {
        this.distanciaSitio = distanciaSitio;
    }

    public String getServiciosSitio() {
        return serviciosSitio;
    }

    public void setServiciosSitio(String serviciosSitio) {
        this.serviciosSitio = serviciosSitio;
    }

    public String getTelefonoCasaSitio() {
        return telefonoCasaSitio;
    }

    public void setTelefonoCasaSitio(String telefonoCasaSitio) {
        this.telefonoCasaSitio = telefonoCasaSitio;
    }

    public String getTelefonoCelularSitio() {
        return telefonoCelularSitio;
    }

    public void setTelefonoCelularSitio(String telefonoCelularSitio) {
        this.telefonoCelularSitio = telefonoCelularSitio;
    }

    public String getClimaSitio() {
        return climaSitio;
    }

    public void setClimaSitio(String climaSitio) {
        this.climaSitio = climaSitio;
    }

    public String getCaracteristicasSitio() {
        return caracteristicasSitio;
    }

    public void setCaracteristicasSitio(String caracteristicasSitio) {
        this.caracteristicasSitio = caracteristicasSitio;
    }

    public String getDireccionSitio() {
        return DireccionSitio;
    }

    public void setDireccionSitio(String DireccionSitio) {
        this.DireccionSitio = DireccionSitio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Restaurant> getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(List<Restaurant> restaurant) {
        this.restaurant = restaurant;
    }

    public List<Hospedaje> getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(List<Hospedaje> hospedaje) {
        this.hospedaje = hospedaje;
    }

    public List<Ruta> getRuta() {
        return ruta;
    }

    public void setRuta(List<Ruta> ruta) {
        this.ruta = ruta;
    }

    public List<Transporte> getTransporte() {
        return transporte;
    }

    public void setTransporte(List<Transporte> transporte) {
        this.transporte = transporte;
    }

    public List<Tienda> getTienda() {
        return tienda;
    }

    public void setTienda(List<Tienda> tienda) {
        this.tienda = tienda;
    }
}