package pe.edu.upc.easytravelapi.dtos;

import pe.edu.upc.easytravelapi.entities.Hotels;
import pe.edu.upc.easytravelapi.entities.Usuarios;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class ComentariosHotelDTO {

    private int idComentariosHotel;

    private double valoracion;

    private String comentario;

    private Hotels hotels;

    private Usuarios usuario;

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
