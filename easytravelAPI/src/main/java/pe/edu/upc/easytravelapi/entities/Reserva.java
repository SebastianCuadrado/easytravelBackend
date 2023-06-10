package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idReserva;
    @ManyToOne
    @JoinColumn(name = "idPaquete")
    private Paquete paquete;
    @Column(name = "fechaReserva")
    private LocalDate fechaReserva;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuario;

    public Reserva() {
    }

    public Reserva(int idReserva, Paquete paquete, LocalDate fechaReserva, Usuarios usuario) {
        this.idReserva = idReserva;
        this.paquete = paquete;
        this.fechaReserva = fechaReserva;
        this.usuario = usuario;
    }

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
