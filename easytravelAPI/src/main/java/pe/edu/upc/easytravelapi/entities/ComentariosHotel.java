package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "ComentariosHotel")
public class ComentariosHotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentariosHotel;
    @Column(name = "valoracion",nullable = false)
    private double valoracion;
    @Column(name = "comentario",length = 400,nullable = false)
    private String comentario;
    @ManyToOne
    @JoinColumn(name = "idHotels")
    private Hotels hotels;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuario;

    public ComentariosHotel() {
    }

    public ComentariosHotel(int idComentariosHotel, double valoracion, String comentario, Hotels hotels, Usuarios usuario) {
        this.idComentariosHotel = idComentariosHotel;
        this.valoracion = valoracion;
        this.comentario = comentario;
        this.hotels = hotels;
        this.usuario = usuario;
    }

    public int getIdComentariosHotel() {
        return idComentariosHotel;
    }

    public void setIdComentariosHotel(int idComentariosHotel) {
        this.idComentariosHotel = idComentariosHotel;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Hotels getHotel() {
        return hotels;
    }

    public void setHotel(Hotels hotels) {
        this.hotels = hotels;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
