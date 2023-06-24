package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.dtos.InteresesUsuarioDTO;
import pe.edu.upc.easytravelapi.dtos.NotificacionUsuarioDTO;
import pe.edu.upc.easytravelapi.entities.Notificacion;

import java.util.List;

public interface INotificacionService {
    public void insertar(Notificacion notificacion);
    List<Notificacion> listar();
    List<Notificacion> findInteresID(Integer id);
    public void delete(int id);
    public Notificacion listId(int id);
    public List<NotificacionUsuarioDTO> reporte02();
}
