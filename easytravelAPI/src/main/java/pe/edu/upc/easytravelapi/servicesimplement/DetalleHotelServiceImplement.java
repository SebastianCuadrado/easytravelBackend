package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.DetalleHotel;
import pe.edu.upc.easytravelapi.repositories.IDetalleHotelRepository;
import pe.edu.upc.easytravelapi.services.IDetalleHotelService;

@Service
public class DetalleHotelServiceImplement implements IDetalleHotelService {

    @Autowired
    private IDetalleHotelRepository dhR;
    @Override
    public void insertar(DetalleHotel detalleHotel) {

    }

    @Override
    public void delete(int idAuthor) {

    }
}
