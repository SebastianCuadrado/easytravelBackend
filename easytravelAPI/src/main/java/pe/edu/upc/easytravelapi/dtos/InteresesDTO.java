package pe.edu.upc.easytravelapi.dtos;

import pe.edu.upc.easytravelapi.entities.Usuarios;

import javax.persistence.*;

public class InteresesDTO {
    private int idInteres;
    private String nombre;
    private Usuarios usuarios;
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
