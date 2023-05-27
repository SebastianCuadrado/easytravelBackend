package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.Hotel;
import pe.edu.upc.easytravelapi.repositories.IHotelRepository;
import pe.edu.upc.easytravelapi.services.IHotelService;

import java.util.List;

@Service
public class HotelServiceImplement implements IHotelService
{
    @Autowired
    private IHotelRepository hR;

    @Override
    public void insert(Hotel hotel) {
        hR.save(hotel);
    }

    @Override
    public List<Hotel> list() {
        return hR.findAll();
    }

    @Override
    public void delete(int idHotel) {
        hR.deleteById(idHotel);

    }

    @Override
    public Hotel listId(int idHotel) {
        return hR.findById(idHotel).orElse(new Hotel());
    }
}
