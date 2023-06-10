package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "paquetes")
public class Paquete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idPaquete;
    @Column(name ="precio", nullable = false )
    private float precio;
    @ManyToOne
    @JoinColumn(name = "idPlace")
    private Place place;
    @ManyToOne
    @JoinColumn(name = "idViaje")
    private Viaje viaje;
    @ManyToOne
    @JoinColumn(name = "idDetalle")
    private DetalleHotel detalle;
    @Column(name ="ahorro", nullable = false )
    private float ahorro;

    public Paquete() {
    }

    public Paquete(int idPaquete, float precio, Place place, Viaje viaje, DetalleHotel detalle, float ahorro) {
        this.idPaquete = idPaquete;
        this.precio = precio;
        this.place = place;
        this.viaje = viaje;
        this.detalle = detalle;
        this.ahorro = ahorro;
    }

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
