package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;

@Entity
@Table
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotificacion;
    @OneToOne
    @JoinColumn(name = "idPaquete")
    private Paquete paquete;
    @ManyToOne
    @JoinColumn(name = "idInteres")
    private Intereses intereses;
    @Column(name = "mensaje", length = 30)
    private String mensaje;

    public Notificacion() {
    }

    public Notificacion(int idNotificacion, Paquete paquete, Intereses intereses, String mensaje) {
        this.idNotificacion = idNotificacion;
        this.paquete = paquete;
        this.intereses = intereses;
        this.mensaje = mensaje;
    }

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
