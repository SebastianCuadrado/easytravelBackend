package pe.edu.upc.easytravelapi.dtos;

import pe.edu.upc.easytravelapi.entities.Usuarios;

public class RoleDTO {
    private long id;

    private String rol;

    private Usuarios user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }
}
