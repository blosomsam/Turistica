package guiaturistica.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
    
    
    /**
     * Agragamos las relaciones , luego del análisis del modelo de dominio y del
     * diagrama de clases y diagrama de secuencia. 
     * Relacion uno a uno
     */
    
    
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    // union entre dos culumnas, relación con la clase id cuenta
    @JoinColumn(name = "id_cuenta")
    // obtener los metodos set y get
    private Cuenta cuenta;
    

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

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}