package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.InteresesDTO;
import pe.edu.upc.easytravelapi.dtos.InteresesUsuarioDTO;
import pe.edu.upc.easytravelapi.dtos.UsuarioDTO;
import pe.edu.upc.easytravelapi.entities.Intereses;
import pe.edu.upc.easytravelapi.entities.Usuarios;
import pe.edu.upc.easytravelapi.services.IInteresesService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/intereses")
public class InteresesController {
    @Autowired
    private IInteresesService Is;

    @PostMapping
    public void registrar(@RequestBody InteresesDTO dto) {
        ModelMapper m = new ModelMapper();
        Intereses i = m.map(dto, Intereses.class);
        Is.insertar(i);
    }


    @GetMapping
    public List<InteresesDTO> listar() {
        return Is.listar().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,InteresesDTO.class);
                }).collect(Collectors.toList());
    }


    @PostMapping("/buscar")
    public List<InteresesDTO> BuscarInteresPorIDUsuario(@RequestBody Integer id) {
        return Is.BuscarInteresPorIDUsuario(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, InteresesDTO.class);
        }).collect(Collectors.toList());
    }



    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){ Is.delete(id);}
    @GetMapping("/{id}")
    public InteresesDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        InteresesDTO dto = m.map(Is.listId(id), InteresesDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody InteresesDTO dto){
        ModelMapper m = new ModelMapper();
        Intereses i = m.map(dto, Intereses.class);
        Is.insertar(i);
    }

    @GetMapping("/intereses-count")
    public List<InteresesUsuarioDTO> getBookCountByAuthor() {
        List<InteresesUsuarioDTO> InteresesUsuariosDTOs = Is.reporte01();
        return InteresesUsuariosDTOs;
    }
}
