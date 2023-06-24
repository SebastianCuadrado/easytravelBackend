package pe.edu.upc.easytravelapi.dtos;

import pe.edu.upc.easytravelapi.entities.Hotels;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class DetalleHotelDTO {
    private int idDetalle;

    private String tipoHabitacion;

    private int cantidadNoches;


    private Hotels hotels;


    private LocalDate checkin;

    private LocalDate checkout;

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

    public Hotels getHotels() {
        return hotels;
    }

    public void setHotels(Hotels hotel) {
        this.hotels = hotels;
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
