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
    @JoinColumn(name = "idHotels")
    private Hotel hotel;

    public Servicios() {
    }

    public Servicios(int idServicio, String nombre, String descripcion, Hotel hotel) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.hotel = hotel;
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
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
