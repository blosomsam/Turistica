package guiaturistica.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sandrojc
 */

@Entity
@Table(name = "Usuario")
@XmlRootElement

@NamedQueries({
    @NamedQuery(name = "usuario.buscarAll",
            query = "SELECT o FROM Persona o"),

    @NamedQuery(name = "Persona.buscarPorNombre",
            query = "SELECT o FROM Persona o WHERE o.nombres = :nombres"),
})


public class Usuario extends Persona implements  Serializable {
    
    @Column(name="telefonoCasaUsuario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String telefonoCasaUsuario;
    
    @Column(name="telCelularUsuario")
    private String telCelularUsuario;
    

    public String getTelefonoCasaUsuario() {
        return telefonoCasaUsuario;
    }

    public void setTelefonoCasaUsuario(String telefonoCasaUsuario) {
        this.telefonoCasaUsuario = telefonoCasaUsuario;
    }

    public String getTelCelularUsuario() {
        return telCelularUsuario;
    }

    public void setTelCelularUsuario(String telCelularUsuario) {
        this.telCelularUsuario = telCelularUsuario;
    } 
}