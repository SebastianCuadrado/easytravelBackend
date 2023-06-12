package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.ActividadDTO;
import pe.edu.upc.easytravelapi.entities.Actividad;
import pe.edu.upc.easytravelapi.services.IActividadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/actividad")
public class ActividadController {
    @Autowired
    private IActividadService aS;

    @PostMapping
    public void insert(@RequestBody ActividadDTO dto) {
        ModelMapper m = new ModelMapper();
        Actividad a = m.map(dto, Actividad.class);
        aS.insert(a);
    }

    @GetMapping
    public List<ActividadDTO> list() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ActividadDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public ActividadDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ActividadDTO dto = m.map(aS.listId(id), ActividadDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ActividadDTO dto) {
        ModelMapper m = new ModelMapper();
        Actividad a = m.map(dto, Actividad.class);
        aS.insert(a);
    }
}
