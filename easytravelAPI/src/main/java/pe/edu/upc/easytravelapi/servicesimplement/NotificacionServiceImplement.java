package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.dtos.InteresesUsuarioDTO;
import pe.edu.upc.easytravelapi.dtos.NotificacionUsuarioDTO;
import pe.edu.upc.easytravelapi.entities.Notificacion;
import pe.edu.upc.easytravelapi.repositories.INotificacionRepository;
import pe.edu.upc.easytravelapi.services.INotificacionService;

import java.util.ArrayList;
import java.util.List;
@Service
public class NotificacionServiceImplement implements INotificacionService {
    @Autowired
    private INotificacionRepository nR;
    @Override
    public void insertar(Notificacion notificacion) {
        nR.save(notificacion);
    }

    @Override
    public List<Notificacion> listar() {
        return nR.findAll();
    }

    @Override
    public List<Notificacion> findInteresID(Integer id) {
        return nR.findInteresID(id);
    }

    @Override
    public void delete(int id) {
        nR.deleteById(id);
    }

    @Override
    public Notificacion listId(int id) {
        return nR.findById(id).orElse(new Notificacion());
    }

    @Override
    public List<NotificacionUsuarioDTO> reporte02() {
        List<String[]> countNotificacionesByUsuario = nR.getCountNotificacionByUsuario();
        List<NotificacionUsuarioDTO> NotificacionesUsuarioDTOs = new ArrayList<>();

        for (String[] data : countNotificacionesByUsuario) {
            NotificacionUsuarioDTO dto = new NotificacionUsuarioDTO();
            dto.setNombre(data[0]);
            dto.setNotificacionesCount(Integer.parseInt(data[1]));
            NotificacionesUsuarioDTOs.add(dto);
        }

        return NotificacionesUsuarioDTOs;
    }
}
