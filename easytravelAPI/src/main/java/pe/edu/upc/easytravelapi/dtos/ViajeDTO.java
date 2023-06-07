package pe.edu.upc.easytravelapi.dtos;

import pe.edu.upc.easytravelapi.entities.EmpresaTransporte;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class ViajeDTO {
    private int idViaje;
    private EmpresaTransporte empresaTransporte;
    private String medioTransporte;
    private LocalDate fechaIda;
    private LocalDate fechaVuelta;
    private String ruta;
    private int duracionPromedio;

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
