package pe.edu.upc.easytravelapi.dtos;

import pe.edu.upc.easytravelapi.entities.DetalleHotel;
import pe.edu.upc.easytravelapi.entities.Place;
import pe.edu.upc.easytravelapi.entities.Viaje;


public class PaqueteDTO {
    private int idPaquete;
    private float precio;
    private Place place;
    private Viaje viaje;
    private DetalleHotel detalle;
    private float ahorro;

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
}
