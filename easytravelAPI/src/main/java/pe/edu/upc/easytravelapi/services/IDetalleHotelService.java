package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.DetalleHotel;
import pe.edu.upc.easytravelapi.entities.Hotels;

import java.util.List;

public interface IDetalleHotelService {

    public void insertar (DetalleHotel detalleHotel);
    List<DetalleHotel> list();
    public DetalleHotel listId(int idDetalle);

    public void delete (int idAuthor);
}
