package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.NotificacionDTO;
import pe.edu.upc.easytravelapi.entities.Notificacion;
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
}
