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
    public void delete(int idHotels) {
        hR.deleteById(idHotels);

    }

    @Override
    public Hotel listId(int idHotels) {
        return hR.findById(idHotels).orElse(new Hotel());
    }
}
