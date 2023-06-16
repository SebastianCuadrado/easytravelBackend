package pe.edu.upc.easytravelapi.dtos;

import pe.edu.upc.easytravelapi.entities.Hotels;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ServiciosDTO {

    private int idServicio;

    private String nombre;

    private String descripcion;
    private Hotels hotels;

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Hotels getHotel() {
        return hotels;
    }

    public void setHotel(Hotels hotel) {
        this.hotels = hotels;
    }
}
