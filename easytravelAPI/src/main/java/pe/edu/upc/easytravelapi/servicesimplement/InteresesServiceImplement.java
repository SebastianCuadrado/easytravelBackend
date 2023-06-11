package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.Intereses;
import pe.edu.upc.easytravelapi.repositories.IInteresesRepository;
import pe.edu.upc.easytravelapi.services.IInteresesService;

import java.util.List;
@Service
public class InteresesServiceImplement implements IInteresesService {

    @Autowired
    private IInteresesRepository iR;

    @Override
    public void insertar(Intereses intereses) {
        iR.save(intereses);
    }

    @Override
    public List<Intereses> listar() {
        return iR.findAll();
    }

    @Override
    public List<Intereses> BuscarInteresPorIDUsuario(Integer id) {
        return iR.findInteresByUserID(id);
    }
}
