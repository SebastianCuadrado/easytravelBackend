package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.Usuarios;
import pe.edu.upc.easytravelapi.repositories.IUsuarioRepository;
import pe.edu.upc.easytravelapi.services.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public Integer insert(Usuarios usuarios) {
        int rpta = uR.buscarUsername(usuarios.getUsername());
        if (rpta == 0) {
            uR.save(usuarios);
        }
        return rpta;
    }

    @Override
    public List<Usuarios> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public Usuarios listId(int id) {
        return uR.findById(id).orElse(new Usuarios());
    }
}
