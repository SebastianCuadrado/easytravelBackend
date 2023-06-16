package pe.edu.upc.easytravelapi.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.HotelsDTO;
import pe.edu.upc.easytravelapi.entities.Hotels;
import pe.edu.upc.easytravelapi.services.IHotelsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/hotels")
public class HotelsController {
    @Autowired
    private IHotelsService hS;

    @PostMapping
    public void insert(@RequestBody HotelsDTO dto){
        ModelMapper m = new ModelMapper();
        Hotels h=m.map(dto, Hotels.class);
        hS.insert(h);
    }

    @GetMapping
    public List<HotelsDTO> list(){
    return hS.list().stream().map(x->{
    ModelMapper m= new ModelMapper();
    return m.map(x,HotelsDTO.class);
    }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
hS.delete(id);
    }

    @GetMapping("/{id}")
    public HotelsDTO listId(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        HotelsDTO dto=m.map(hS.listId(id),HotelsDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody HotelsDTO dto){
        ModelMapper m = new ModelMapper();
        Hotels h=m.map(dto, Hotels.class);
        hS.insert(h);
    }
}
