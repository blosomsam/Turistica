package guiaturistica.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sandrojc
 */
//indicamos que es una entidad para jpa
@Entity
//indincar como se va a relacionar y crea la tabla en la base de datos
@Table(name = "Persona")
//mapear en un fichero xml de la clase en cualquier fichero
@XmlRootElement
//consultar en sql
@NamedQueries({
    @NamedQuery(name = "Persona.buscarAll",
            query = "SELECT o FROM Persona o"),
    @NamedQuery(name = "persona.buscarPorId",
            query = "SELECT o FROM Persona o WHERE o.id_persona= :id_persona"),
    @NamedQuery(name = "persona.buscarPorNombre",
            query = "SELECT o FROM Persona o WHERE o.nombres = :nombres"),
    @NamedQuery(name = "persona.buscarPorCedula",
            query = "SELECT o FROM Persona o WHERE o.cedula = :cedula")
})

public class Persona implements Serializable{
    @Id
    @Column(name="id_persona")
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Ides para las tablas
    private Long id_persona;
    
    @Column(name ="nombres")
    private String nombres;
    
    @Column(name ="apellidos")
    private String apellidos;
    
    @Column (name = "cedula", unique = true)
    private String cedula;
    
    @Column(name = "direccion")
    private String direccion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimieto;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;
    
    //Relacion de uno a muchos
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "persona",cascade= CascadeType.ALL)
    private List<Sitio> sitio;
    
    public Long getId_persona() {
        return id_persona;
    }
    

    // Metodos set y get
    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimieto() {
        return fechaNacimieto;
    }

    public void setFechaNacimieto(Date fechaNacimieto) {
        this.fechaNacimieto = fechaNacimieto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Sitio> getSitio() {
        return sitio;
    }

    public void setSitio(List<Sitio> sitio) {
        this.sitio = sitio;
    }
}