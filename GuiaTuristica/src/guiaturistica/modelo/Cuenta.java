package guiaturistica.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sandrojc
 */
@Entity
@Table(name = "Cuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "cuenta.buscarAll",
            query = "SELECT o FROM Cuenta o"),
    @NamedQuery(name = "cuenta.buscarPorId",
            query = "SELECT o FROM Cuenta o WHERE o.id_cuenta = :id_cuenta"),
    @NamedQuery(name = "persona.buscarPorUsuario",
            query = "SELECT o FROM Cuenta o WHERE o.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Persona.buscarPorFechaCreacion",
            query = "SELECT o FROM Cuenta o WHERE o.fechaCreacion = :fechaCreacion")
})

public class Cuenta implements Serializable{
     
    @Id
    @Column (name = "id_cuenta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long    id_cuenta;
    
    @Column (name = "nombreUsuario")
    private String  nombreUsuario;
    
    @Column (name = "claveUsuario")
    private String  claveUsuario;

    @Temporal(TemporalType.TIMESTAMP)
    private Date    fechaCreacion;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date    fechaModificacion;

    @Column (name = "estado")
    private String  estado;

    
    @OneToOne(mappedBy = "cuenta")
     private Usuario usuario;

    public Long getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(Long id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}