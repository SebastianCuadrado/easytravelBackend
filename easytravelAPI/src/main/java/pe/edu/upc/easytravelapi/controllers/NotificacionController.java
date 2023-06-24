package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.InteresesUsuarioDTO;
import pe.edu.upc.easytravelapi.dtos.NotificacionDTO;
import pe.edu.upc.easytravelapi.dtos.NotificacionUsuarioDTO;
import pe.edu.upc.easytravelapi.dtos.UsuarioDTO;
import pe.edu.upc.easytravelapi.entities.Notificacion;
import pe.edu.upc.easytravelapi.entities.Usuarios;
import pe.edu.upc.easytravelapi.services.INotificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificacion")
public class NotificacionController {
    @Autowired
    private INotificacionService nS;
    @PostMapping
    public void registrar(@RequestBody NotificacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Notificacion n = m.map(dto, Notificacion.class);
        nS.insertar(n);
    }


    @GetMapping
    public List<NotificacionDTO> listar() {
        return nS.listar().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,NotificacionDTO.class);
        }).collect(Collectors.toList());
    }


    @PostMapping("/buscar")
    public List<NotificacionDTO> BuscarInteresID(@RequestBody Integer id) {
        return nS.findInteresID(id).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,NotificacionDTO.class);
        }).collect(Collectors.toList());
    }



    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        nS.delete(id);
    }
    @GetMapping("/{id}")
    public NotificacionDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        NotificacionDTO dto = m.map(nS.listId(id), NotificacionDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody NotificacionDTO dto){
        ModelMapper m = new ModelMapper();
        Notificacion n = m.map(dto, Notificacion.class);
        nS.insertar(n);
    }

    @GetMapping("/notificaciones-count")
    public List<NotificacionUsuarioDTO> getBookCountByAuthor() {
        List<NotificacionUsuarioDTO> NotificacionesUsuariosDTOs = nS.reporte02();
        return NotificacionesUsuariosDTOs;
    }
}
