package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Detalle")
public class DetalleHotel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalle;
    @Column(name = "tipoHabitacion",length = 20,nullable = false)
private String tipoHabitacion;
    @Column(name = "cantidadNoches",nullable = false)
private int cantidadNoches;

    @ManyToOne
    @JoinColumn(name = "idHotels")
    private Hotel hotel;

    @Column(name = "checkin", nullable = false)
    private LocalDate checkin;
    @Column(name = "checkout", nullable = false)
    private LocalDate checkout;

    public DetalleHotel() {
    }

    public DetalleHotel(int idDetalle, String tipoHabitacion, int cantidadNoches, Hotel hotel, LocalDate checkin, LocalDate checkout) {
        this.idDetalle = idDetalle;
        this.tipoHabitacion = tipoHabitacion;
        this.cantidadNoches = cantidadNoches;
        this.hotel = hotel;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }
}
