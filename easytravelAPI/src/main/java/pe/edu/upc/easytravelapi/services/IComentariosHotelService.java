package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.ComentariosHotel;
import pe.edu.upc.easytravelapi.entities.Hotel;

import java.util.List;

public interface IComentariosHotelService {
    public void insert (ComentariosHotel comentario);
    List<ComentariosHotel> list();

    public void delete (int idComentariosHotel);
}
