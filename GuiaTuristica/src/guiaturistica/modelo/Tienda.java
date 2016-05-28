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
@Table(name = "Tienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "tienda.BuscarAll",
            query = "SELECT o FROM Tienda o"),
    @NamedQuery(name = "tienda.BuscarPorId",
            query = "SELECT o FROM Tienda o WHERE o.id_tienda = :id_tienda "),
    @NamedQuery(name = "Tienda.BuscarPorTipo",
            query = "SELECT o FROM Tienda o WHERE o.tipoTienda = :tipoTienda ")
})

public class Tienda implements  Serializable{
    
    @Id
    @Column(name="id_tienda")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private long  id_tienda;
    
    @Column(name="nombreTienda")
        private String  nombreTienda;
    
    @Column(name="tipoTienda")
        private String  tipoTienda;
    
    @Column(name="direccionTienda")
        private String  direccionTienda;
    
    @Column(name="telefonoTienda")
        private String  telefonoTienda;
    

    public long getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(long id_tienda) {
        this.id_tienda = id_tienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getTipoTienda() {
        return tipoTienda;
    }

    public void setTipoTienda(String tipoTienda) {
        this.tipoTienda = tipoTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getTelefonoTienda() {
        return telefonoTienda;
    }

    public void setTelefonoTienda(String telefonoTienda) {
        this.telefonoTienda = telefonoTienda;
    }
}
