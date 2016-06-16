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
@Table(name = "Hospedaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "hospedaje.buscalAll",
            query = "SELECT o FROM Hospedaje o"),
    @NamedQuery(name = "hospedaje.buscarPorId",
            query = "SELECT o FROM Hospedaje o WHERE o.id_hospedaje= :id_hospedaje"),
    @NamedQuery(name = "hospedaje.buscarPorNombreHospedaje",
            query = "SELECT o FROM Hospedaje o WHERE o.nombreHospedaje = :nombreHospedaje"),
    @NamedQuery(name = "Hospedaje.buscarPorDireccion",
            query = "SELECT o FROM Hospedaje o WHERE o.direccionHospedaje = :direccionHospedaje")
})

public class Hospedaje implements Serializable {
    
    @Id
    @Column (name = "id_hospedaje")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long    id_hospedaje;
    
    @Column (name = "tipoHospedaje")
    private String  tipoHospedaje;

    @Column (name = "nombreHospedaje")
    private String  nombreHospedaje;
    
    @Column (name = "serviciosHospedaje")
    private String  serviciosHospedaje;

    @Column (name = "direccionHospedaje")
    private String  direccionHospedaje;

    @Column (name = "categoriaHospedaje")
    private String  categoriaHospedaje;

    @Column (name = "telefonoFijoHospedaje")
    private String  telefonoFijoHospedaje;

    @Column (name = "telefonoCelularHospedaje")
    private String  telefonoCelularHospedaje;

    @Column (name = "correoElectronicoHospedaje")
    private String  correoElectronicoHospedaje;
    

    //RELACIONES ENTRE LAS CLASES
    
    //Relación con sitio @ManyToMany
    @ManyToMany(mappedBy = "hospedaje",cascade = CascadeType.ALL, targetEntity = Sitio.class)
    private List<Sitio> sitio;
    //Relación con sitio @ManyToMany

    
    
    //MÉTODOS SET Y GET
    public Long getId_hospedaje() {
        return id_hospedaje;
    }

    public void setId_hospedaje(Long id_hospedaje) {
        this.id_hospedaje = id_hospedaje;
    }

    public String getTipoHospedaje() {
        return tipoHospedaje;
    }

    public void setTipoHospedaje(String tipoHospedaje) {
        this.tipoHospedaje = tipoHospedaje;
    }

    public String getNombreHospedaje() {
        return nombreHospedaje;
    }

    public void setNombreHospedaje(String nombreHospedaje) {
        this.nombreHospedaje = nombreHospedaje;
    }

    public String getDireccionHospedaje() {
        return direccionHospedaje;
    }

    public void setDireccionHospedaje(String direccionHospedaje) {
        this.direccionHospedaje = direccionHospedaje;
    }

    public String getCategoriaHospedaje() {
        return categoriaHospedaje;
    }

    public void setCategoriaHospedaje(String categoriaHospedaje) {
        this.categoriaHospedaje = categoriaHospedaje;
    }

    public String getTelefonoFijoHospedaje() {
        return telefonoFijoHospedaje;
    }

    public void setTelefonoFijoHospedaje(String telefonoFijoHospedaje) {
        this.telefonoFijoHospedaje = telefonoFijoHospedaje;
    }

    public String getTelefonoCelularHospedaje() {
        return telefonoCelularHospedaje;
    }

    public void setTelefonoCelularHospedaje(String telefonoCelularHospedaje) {
        this.telefonoCelularHospedaje = telefonoCelularHospedaje;
    }

    public String getCorreoElectronicoHospedaje() {
        return correoElectronicoHospedaje;
    }

    public void setCorreoElectronicoHospedaje(String correoElectronicoHospedaje) {
        this.correoElectronicoHospedaje = correoElectronicoHospedaje;
    }

    public List<Sitio> getSitio() {
        return sitio;
    }

    public void setSitio(List<Sitio> sitio) {
        this.sitio = sitio;
    }

    public String getServiciosHospedaje() {
        return serviciosHospedaje;
    }

    public void setServiciosHospedaje(String serviciosHospedaje) {
        this.serviciosHospedaje = serviciosHospedaje;
    }
}