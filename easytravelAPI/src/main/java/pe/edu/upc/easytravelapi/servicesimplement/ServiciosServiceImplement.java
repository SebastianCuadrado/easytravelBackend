package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.Hotels;
import pe.edu.upc.easytravelapi.entities.Servicios;
import pe.edu.upc.easytravelapi.repositories.IServiciosRepository;
import pe.edu.upc.easytravelapi.services.IServiciosService;

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
}
