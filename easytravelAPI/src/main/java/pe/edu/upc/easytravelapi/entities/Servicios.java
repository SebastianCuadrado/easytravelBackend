package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;
@Entity
@Table(name = "Servicios")
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;
    @Column(name = "nombreServ",length =40,nullable = false )
    private String nombre;
    @Column(name = "decripcionServ",length =200,nullable = false )
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idHotels",nullable = false)
    private Hotel hotels;

    public Servicios() {
    }

    public Servicios(int idServicio, String nombre, String descripcion, Hotel hotels) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.hotels = hotels;
    }

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

    public Hotel getHotel() {
        return hotels;
    }

    public void setHotel(Hotel hotel) {
        this.hotels = hotels;
    }
}
