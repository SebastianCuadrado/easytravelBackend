package pe.edu.upc.easytravelapi.dtos;

public class InteresesUsuarioDTO {
    private String nombre;
    private int InteresesCount;

    public InteresesUsuarioDTO() {
    }

    public InteresesUsuarioDTO(String nombre, int interesesCount) {
        this.nombre = nombre;
        InteresesCount = interesesCount;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInteresesCount() {
        return InteresesCount;
    }

    public void setInteresesCount(int interesesCount) {
        InteresesCount = interesesCount;
    }
}
