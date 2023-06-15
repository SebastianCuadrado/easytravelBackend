package pe.edu.upc.easytravelapi.dtos;

import pe.edu.upc.easytravelapi.entities.DetalleHotel;
import pe.edu.upc.easytravelapi.entities.Hotel;
import pe.edu.upc.easytravelapi.entities.Place;
import pe.edu.upc.easytravelapi.entities.Viaje;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


public class PaqueteDTO {
    private int idPaquete;
    private float precio;
    private Place place;
    private Viaje viaje;
    private DetalleHotel detalle;
    private float ahorro;
    private String tipoHabitacion;
    private int cantidadNoches;
    private Hotel hotel;
    private LocalDate checkin;
    private LocalDate checkout;

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public DetalleHotel getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleHotel detalle) {
        this.detalle = detalle;
    }

    public float getAhorro() {
        return ahorro;
    }

    public void setAhorro(float ahorro) {
        this.ahorro = ahorro;
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
