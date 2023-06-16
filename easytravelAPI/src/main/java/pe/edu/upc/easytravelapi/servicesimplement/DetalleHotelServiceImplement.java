package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.DetalleHotel;
import pe.edu.upc.easytravelapi.repositories.IDetalleHotelRepository;
import pe.edu.upc.easytravelapi.services.IDetalleHotelService;

import java.util.List;

@Service
public class DetalleHotelServiceImplement implements IDetalleHotelService {

    @Autowired
    private IDetalleHotelRepository dhR;
    @Override
    public void insertar(DetalleHotel detalleHotel) {
        dhR.save(detalleHotel);
    }

    @Override
    public List<DetalleHotel> list() {
        return dhR.findAll();
    }

    @Override
    public DetalleHotel listId(int idDetalle) {
        return dhR.findById(idDetalle).orElse(new DetalleHotel());
    }

    @Override
    public void delete(int idDetalle) {
        dhR.deleteById(idDetalle);

    }
}
