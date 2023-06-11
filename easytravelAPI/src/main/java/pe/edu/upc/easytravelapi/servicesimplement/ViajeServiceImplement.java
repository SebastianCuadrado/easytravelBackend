package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.Viaje;
import pe.edu.upc.easytravelapi.repositories.IViajeRepository;
import pe.edu.upc.easytravelapi.services.IViajeService;

import java.util.List;
@Service
public class ViajeServiceImplement implements IViajeService {
    @Autowired
    private IViajeRepository vR;
    @Override
    public void insert(Viaje viaje) {
        vR.save(viaje);
    }

    @Override
    public List<Viaje> list() {
        return vR.findAll();
    }

    @Override
    public void delete(int idViaje) {
        vR.deleteById(idViaje);
    }

    @Override
    public Viaje listId(int idViaje) {
        return vR.findById(idViaje).orElse(new Viaje());
    }
}
