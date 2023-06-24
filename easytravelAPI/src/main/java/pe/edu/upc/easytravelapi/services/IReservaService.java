package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.dtos.HotelReservasDTO;
import pe.edu.upc.easytravelapi.entities.Reserva;

import java.util.List;

public interface IReservaService {
    public void insert(Reserva reserva);
    List<Reserva> list();
    List<Reserva> findReservaByUserID(Integer idReserva);

    public List<HotelReservasDTO> reporteHotelesmasReservados();
}
