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
@Table(name = "Transporte")
@XmlRootElement

@NamedQueries({
    @NamedQuery(name = "transporte.BuscarAll",
            query = "SELECT o FROM Transporte o"),
    
    @NamedQuery(name = "transporte.BuscarPorId",
            query = "SELECT o FROM Transporte o WHERE o.id_transporte= :id_transporte"),
    
    @NamedQuery(name = "transporte.BuscarPorNombre",
            query = "SELECT o FROM Transporte o WHERE o.nombreTransporte= :nombreTransporte"),
    
    @NamedQuery(name = "transporte.BuscarPorHorario",
            query = "SELECT o FROM Transporte o WHERE o.horarioTransporte= :horarioTransporte")
})

public class Transporte implements Serializable {

    @Id
    @Column(name = "id_transporte")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_transporte;
    
    @Column(name = "nombreTransporte")
    private String nombreTransporte;
    
    @Column(name = "tipo_transporte")
    private String tipo_transporte;
    
    @Column(name = "horarioTransporte")
    private String horarioTransporte;
    
    @Column(name = "caracteristicaTransporte")
    private String caracteristicaTransporte;
    
    

    public Long getId_transporte() {
        return id_transporte;
    }

    public void setId_transporte(Long id_transporte) {
        this.id_transporte = id_transporte;
    }

    public String getNombreTransporte() {
        return nombreTransporte;
    }

    public void setNombreTransporte(String nombreTransporte) {
        this.nombreTransporte = nombreTransporte;
    }

    public String getTipo_transporte() {
        return tipo_transporte;
    }

    public void setTipo_transporte(String tipo_transporte) {
        this.tipo_transporte = tipo_transporte;
    }

    public String getHorarioTransporte() {
        return horarioTransporte;
    }

    public void setHorarioTransporte(String horarioTransporte) {
        this.horarioTransporte = horarioTransporte;
    }

    public String getCaracteristicaTransporte() {
        return caracteristicaTransporte;
    }

    public void setCaracteristicaTransporte(String caracteristicaTransporte) {
        this.caracteristicaTransporte = caracteristicaTransporte;
    }
}