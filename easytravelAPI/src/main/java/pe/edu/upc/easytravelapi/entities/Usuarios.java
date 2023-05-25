package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre", length = 40, nullable = false)
    private String nombre;
    @Column(name="apellidos", length = 60, nullable = false)
    private String apellidos;
    @Column(name="email", length = 80, nullable = false)
    private String email;
    @Column(name="fechaNacimiento")
    private LocalDate fechaNacimiento;
    @Column(name="celular", length = 9, nullable = false)
    private String celular;
    @Column(name="ubicacion", length = 30, nullable = false)
    private String ubicacion;

    public Usuarios() {
    }

    public Usuarios(int id, String nombre, String apellidos, String email, LocalDate fechaNacimiento, String celular, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}

