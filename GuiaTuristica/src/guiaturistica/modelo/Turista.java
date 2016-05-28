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
@Table(name ="Turista")
@XmlRootElement

@NamedQueries({
      @NamedQuery(name="persona.buscarAll", 
              query ="SELECT o FROM Persona o"),
    
      @NamedQuery(name="persona.buscarPorNombre", 
              query ="SELECT o FROM Persona o WHERE o.nombres = "
                      + ":nombres"),
      
      @NamedQuery(name="Persona.buscarPorLugarDeOrigen",
              query ="SELECT o FROM Turista o WHERE o.lugarDeOrigen = "
                      + ":lugarDeOrigen")
})


public class Turista extends Persona implements Serializable {
   
    @Column(name = "lugarDeOrigen")
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String lugarDeOrigen;

    
    public String getLugarDeOrigen() {
        return lugarDeOrigen;
    }

    public void setLugarDeOrigen(String lugarDeOrigen) {
        this.lugarDeOrigen = lugarDeOrigen;
    }
}
