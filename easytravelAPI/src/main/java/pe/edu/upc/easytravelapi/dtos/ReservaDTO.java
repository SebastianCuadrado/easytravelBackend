package pe.edu.upc.easytravelapi.dtos;

import pe.edu.upc.easytravelapi.entities.Paquete;
import pe.edu.upc.easytravelapi.entities.Usuarios;

import java.time.LocalDate;

public class ReservaDTO {
    private int idReserva;
    private Paquete paquete;
    private LocalDate fechaReserva;
    private Usuarios usuario;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
