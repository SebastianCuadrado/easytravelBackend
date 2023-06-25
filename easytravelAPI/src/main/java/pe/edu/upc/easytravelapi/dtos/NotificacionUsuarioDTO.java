package pe.edu.upc.easytravelapi.dtos;

public class NotificacionUsuarioDTO {
    private String nombre;
    private int NotificacionesCount;

    public NotificacionUsuarioDTO() {
    }

    public NotificacionUsuarioDTO(String nombre, int notificacionesCount) {
        this.nombre = nombre;
        NotificacionesCount = notificacionesCount;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNotificacionesCount() {
        return NotificacionesCount;
    }

    public void setNotificacionesCount(int notificacionesCount) {
        NotificacionesCount = notificacionesCount;
    }
}
