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
@Table(name ="Ruta")
@XmlRootElement
@NamedQueries({
      @NamedQuery(name = "ruta.buscarAll", 
              query = "SELECT o FROM Ruta o"),
      @NamedQuery(name = "ruta.buscarPorId", 
              query = "SELECT o FROM Ruta o WHERE o.id_ruta= :id_ruta"),
      @NamedQuery(name = "Ruta.buscarPorNombre", 
              query = "SELECT o FROM Ruta o WHERE o.nombreRuta = :nombreRuta"),
      })

public class Ruta implements Serializable {
    
    @Id
    @Column (name = "id_ruta")
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long    id_ruta;
    
    @Column (name = "nombreRuta")
    private String  nombreRuta;
    
    @Column (name = "origen")
    private String  origen;
    
    @Column (name = "destino")
    private String  destino;
   
    @Column (name = "puntoPartida")
    private String  puntoPartida;
    
    @Column (name = "tiempo")
    private String  tiempo;

    
    public Long getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(Long id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(String puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }
    
}