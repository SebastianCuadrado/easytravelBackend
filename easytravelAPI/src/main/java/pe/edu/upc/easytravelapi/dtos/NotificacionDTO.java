package pe.edu.upc.easytravelapi.dtos;

import pe.edu.upc.easytravelapi.entities.Intereses;
import pe.edu.upc.easytravelapi.entities.Paquete;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class NotificacionDTO {
    private int idNotificacion;
    private Paquete paquete;
    private Intereses intereses;
    private String mensaje;

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Intereses getIntereses() {
        return intereses;
    }

    public void setIntereses(Intereses intereses) {
        this.intereses = intereses;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
