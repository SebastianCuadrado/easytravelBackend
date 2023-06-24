package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.dtos.InteresesUsuarioDTO;
import pe.edu.upc.easytravelapi.entities.Intereses;
import pe.edu.upc.easytravelapi.repositories.IInteresesRepository;
import pe.edu.upc.easytravelapi.services.IInteresesService;

import java.util.ArrayList;
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

    @Override
    public void delete(int id) {
        iR.deleteById(id);
    }

    @Override
    public Intereses listId(int id) {
        return iR.findById(id).orElse(new Intereses());
    }

    @Override
    public List<InteresesUsuarioDTO> reporte01() {
        List<String[]> countInteresesByUsuario = iR.getCountInteresesByUsuario();
        List<InteresesUsuarioDTO> InteresesUsuarioDTOs = new ArrayList<>();

        for (String[] data : countInteresesByUsuario) {
            InteresesUsuarioDTO dto = new InteresesUsuarioDTO();
            dto.setNombre(data[0]);
            dto.setInteresesCount(Integer.parseInt(data[1]));
            InteresesUsuarioDTOs.add(dto);
        }

        return InteresesUsuarioDTOs;
    }
}
