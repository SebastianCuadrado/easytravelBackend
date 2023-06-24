package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.dtos.HotelReservasDTO;
import pe.edu.upc.easytravelapi.entities.Reserva;
import pe.edu.upc.easytravelapi.repositories.IReservaRepository;
import pe.edu.upc.easytravelapi.services.IReservaService;

import java.util.ArrayList;
import java.util.List;

@Service
public class  ReservaServiceImplement implements IReservaService {
    @Autowired
    private IReservaRepository irR;
    @Override
    public void insert(Reserva reserva) {
        irR.save(reserva);
    }

    @Override
    public List<Reserva> list() {
        return irR.findAll();
    }

    @Override
    public List<Reserva> findReservaByUserID(Integer idReserva) {
        return irR.findReservaByUserID(idReserva);
    }

    @Override
    public List<HotelReservasDTO> reporteHotelesmasReservados() {
        List<String[]> countReservabyHotels = irR.getCountReservacionesByHotel();
        List<HotelReservasDTO>  reservaHotelDTOs= new ArrayList<>();
        for(String[] data: countReservabyHotels){
            HotelReservasDTO dto= new HotelReservasDTO();
            dto.setNombre(data[0]);
            dto.setReservascount(Integer.parseInt(data[1]));
            reservaHotelDTOs.add(dto);
        }

        return reservaHotelDTOs;
    }
}
