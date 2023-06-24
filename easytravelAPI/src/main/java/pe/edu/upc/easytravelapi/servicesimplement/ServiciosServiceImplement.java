package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.dtos.ServiciosHotelDTO;
import pe.edu.upc.easytravelapi.entities.Hotels;
import pe.edu.upc.easytravelapi.entities.Servicios;
import pe.edu.upc.easytravelapi.repositories.IServiciosRepository;
import pe.edu.upc.easytravelapi.services.IServiciosService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiciosServiceImplement implements IServiciosService {

    @Autowired
    private IServiciosRepository sR;

    @Override
    public void insertar(Servicios servicio) {sR.save(servicio) ;}

    @Override
    public void eliminar(int idServicio) {

    }

    @Override
    public List<Servicios> listar() {
        return sR.findAll();
    }

    @Override
    public Servicios listId(int idServicio) {
        return sR.findById(idServicio).orElse(new Servicios());
    }

    @Override
    public List<Servicios> findByHotelsIdHotels(int hotelId) {
        return sR.findByHotelsIdHotels(hotelId);
    }

    @Override
    public List<ServiciosHotelDTO> reporteHotelesconmasServicios() {

        List<String[]> countServiciosByHotel = sR.getCountServiciosByHotel();
        List<ServiciosHotelDTO> serviciosHotelDTOS = new ArrayList<>();

        for (String[] data : countServiciosByHotel) {
            ServiciosHotelDTO dto = new ServiciosHotelDTO();
            dto.setNombre(data[0]);
            dto.setServiceCount(Integer.parseInt(data[1]));
            serviciosHotelDTOS.add(dto);
        }

        return serviciosHotelDTOS;

    }

}
