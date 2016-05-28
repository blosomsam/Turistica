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
@Table(name = "Rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "rol.buscarAll",
            query = "SELECT o FROM Rol o"),
    @NamedQuery(name = "rol.buscarPorId",
            query = "SELECT o FROM Rol o WHERE o.id_rol= :id_rol"),
    @NamedQuery(name = "rol.buscarPorNombreRol",
            query = "SELECT o FROM Rol o WHERE o.nombreRol = :nombreRol"),})

public class Rol implements Serializable {

    @Id
    @Column(name = "id_rol")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_rol;

    @Column(name = "nombreRol")
    private String nombreRol;

    @Column(name = "descripcionRol")
    private String descripcionRol;

    
    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

}
