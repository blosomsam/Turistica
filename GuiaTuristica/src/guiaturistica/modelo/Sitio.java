package guiaturistica.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
}