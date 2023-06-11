package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.ComentariosHotel;
import pe.edu.upc.easytravelapi.repositories.IComentariosHotelRepository;
import pe.edu.upc.easytravelapi.services.IComentariosHotelService;

import java.util.List;

@Service
public class ComentariosHotelServiceImplement implements IComentariosHotelService {

    @Autowired
    private IComentariosHotelRepository chR;
    @Override
    public void insert(ComentariosHotel comentario) {chR.save(comentario);

    }

    @Override
    public List<ComentariosHotel> list() {
        return chR.findAll();
    }

    @Override
    public void delete(int idComentariosHotel) {
        chR.deleteById(idComentariosHotel);

    }
}
