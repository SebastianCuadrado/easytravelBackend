package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "paquetes")
public class Paquete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idPaquete;

    @Column(name = "nombre",length =40)
    private String nombre;
    @Column(name ="precio", nullable = false )
    private float precio;
    @ManyToOne
    @JoinColumn(name = "idPlace")
    private Place place;
    @ManyToOne
    @JoinColumn(name = "idViaje")
    private Viaje viaje;
    @Column(name ="ahorro", nullable = false )
    private float ahorro;
    @Column(name = "tipoHabitacion",length = 20,nullable = false)
    private String tipoHabitacion;
    @Column(name = "cantidadNoches",nullable = false)
    private int cantidadNoches;
    @ManyToOne
    @JoinColumn(name = "idHotels")
    private Hotels hotels;
    @Column(name = "checkin", nullable = false)
    private LocalDate checkin;
    @Column(name = "checkout", nullable = false)
    private LocalDate checkout;

    public Paquete() {
    }

    public Paquete(int idPaquete,String nombre, float precio, Place place, Viaje viaje, float ahorro, String tipoHabitacion, int cantidadNoches, Hotels hotels, LocalDate checkin, LocalDate checkout) {
        this.idPaquete = idPaquete;
        this.nombre=nombre;
        this.precio = precio;
        this.place = place;
        this.viaje = viaje;
        this.ahorro = ahorro;
        this.tipoHabitacion = tipoHabitacion;
        this.cantidadNoches = cantidadNoches;
        this.hotels = hotels;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Hotels getHotels() {
        return hotels;
    }

    public void setHotels(Hotels hotels) {
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
