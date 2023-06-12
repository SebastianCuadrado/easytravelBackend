package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.Actividad;
import pe.edu.upc.easytravelapi.repositories.IActividadRepository;
import pe.edu.upc.easytravelapi.services.IActividadService;

import java.util.List;

@Service
public class ActividadServiceImplement implements IActividadService {
    @Autowired
    private IActividadRepository aR;

    @Override
    public void insert(Actividad actividad) {
        aR.save(actividad);
    }

    @Override
    public List<Actividad> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idActividad) {
        aR.deleteById(idActividad);
    }

    @Override
    public Actividad listId(int idActividad) {
        return aR.findById(idActividad).orElse(new Actividad());
    }
}
