package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.dtos.ServiciosHotelDTO;
import pe.edu.upc.easytravelapi.entities.ComentariosHotel;
import pe.edu.upc.easytravelapi.entities.Hotels;
import pe.edu.upc.easytravelapi.entities.Servicios;

import java.util.List;

public interface IServiciosService {

public void insertar(Servicios servicio);
    public void eliminar(int idServicio);
List<Servicios>listar();
    public Servicios listId(int idServicio);

    List<Servicios> findByHotelsIdHotels(int hotelId);

       public List<ServiciosHotelDTO> reporteHotelesconmasServicios();
}
