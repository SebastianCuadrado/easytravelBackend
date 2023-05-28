package pe.edu.upc.easytravelapi.servicesimplements;

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
    public void insert(Usuarios usuarios) {
        uR.save(usuarios);
    }

    @Override
    public List<Usuarios> list() {
        return uR.findAll();
    }
}
