package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.Hotels;
import pe.edu.upc.easytravelapi.repositories.IHotelsRepository;
import pe.edu.upc.easytravelapi.services.IHotelsService;

import java.util.List;

@Service
public class HotelsServiceImplement implements IHotelsService
{
    @Autowired
    private IHotelsRepository hR;

    @Override
    public void insert(Hotels hotels) {
        hR.save(hotels);
    }

    @Override
    public List<Hotels> list() {
        return hR.findAll();
    }

    @Override
    public void delete(int idHotels) {
        hR.deleteById(idHotels);

    }

    @Override
    public Hotels listId(int idHotels) {
        return hR.findById(idHotels).orElse(new Hotels());
    }
}
