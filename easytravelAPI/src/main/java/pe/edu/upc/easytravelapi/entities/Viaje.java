package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Viaje")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViaje;
    @ManyToOne
    @JoinColumn(name = "idEmpresaTransporte")
    private EmpresaTransporte empresaTransporte;
    @Column(name = "medioTransporte", length = 20, nullable = false)
    private String medioTransporte;
    @Column(name = "fechaIda", nullable = false)
    private LocalDate fechaIda;
    @Column(name = "fechaVuelta", nullable = false)
    private LocalDate fechaVuelta;
    @Column(name = "ruta", length = 50, nullable = false)
    private String ruta;
    @Column(name = "duracionPromedio", nullable = false)
    private int duracionPromedio;

    public Viaje() {
    }

    public Viaje(int idViaje, EmpresaTransporte empresaTransporte, String medioTransporte, LocalDate fechaIda, LocalDate fechaVuelta, String ruta, int duracionPromedio) {
        this.idViaje = idViaje;
        this.empresaTransporte = empresaTransporte;
        this.medioTransporte = medioTransporte;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.ruta = ruta;
        this.duracionPromedio = duracionPromedio;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }

    public void setEmpresaTransporte(EmpresaTransporte empresaTransporte) {
        this.empresaTransporte = empresaTransporte;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public LocalDate getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(LocalDate fechaIda) {
        this.fechaIda = fechaIda;
    }

    public LocalDate getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(LocalDate fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getDuracionPromedio() {
        return duracionPromedio;
    }

    public void setDuracionPromedio(int duracionPromedio) {
        this.duracionPromedio = duracionPromedio;
    }
}
