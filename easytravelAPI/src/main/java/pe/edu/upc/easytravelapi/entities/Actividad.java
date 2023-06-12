package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "Actividad")
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idActividad;
    @Column(name = "nombre", length = 30, nullable = false)
    private String nombre;
    @Column(name = "categoria", length = 30, nullable = false)
    private String categoria;
    @Column(name = "descripcion", length = 50, nullable = false)
    private String descripcion;
    @Column(name = "duracion", nullable = false)
    private int duracion;
    @ManyToOne
    @JoinColumn(name = "idPaquete")
    private Paquete paquete;

    public Actividad() {
    }

    public Actividad(int idActividad, String nombre, String categoria, String descripcion, int duracion, Paquete paquete) {
        this.idActividad = idActividad;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.paquete = paquete;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
}
