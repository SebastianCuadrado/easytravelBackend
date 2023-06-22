package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.Paquete;
import pe.edu.upc.easytravelapi.repositories.IPaqueteRepository;
import pe.edu.upc.easytravelapi.services.IPaqueteService;

import java.util.List;

@Service
public class PaqueteServiceImplement implements IPaqueteService {
    @Autowired
    private IPaqueteRepository ipR;

    @Override
    public void insert(Paquete paquete) {
        ipR.save(paquete);
    }

    @Override
    public List<Paquete> list() {
        return ipR.findAll();
    }

    @Override
    public List<Paquete> findPaqueteByPrecioGreaterThan(float precio) {
        return ipR.findPaqueteByPrecioGreaterThan(precio);
    }

    @Override
    public void delete(int idPaquete) {
        ipR.deleteById(idPaquete);
    }

    @Override
    public Paquete listId(int idPaquete) {
        return ipR.findById(idPaquete).orElse(new Paquete());
    }


}
