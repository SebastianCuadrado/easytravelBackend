package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;

@Entity
@Table
public class Intereses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInteres;
    @Column(name = "nombre", length = 100)
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "id")
    private Usuarios usuarios;
    public Intereses() {
    }

    public Intereses(int idInteres, String nombre, Usuarios usuarios) {
        this.idInteres = idInteres;
        this.nombre = nombre;
        this.usuarios = usuarios;
    }

    public int getIdInteres() {
        return idInteres;
    }

    public void setIdInteres(int idInteres) {
        this.idInteres = idInteres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
