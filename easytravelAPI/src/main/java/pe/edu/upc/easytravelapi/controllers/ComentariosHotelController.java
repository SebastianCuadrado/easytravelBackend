package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.ComentariosHotelDTO;

import pe.edu.upc.easytravelapi.entities.ComentariosHotel;

import pe.edu.upc.easytravelapi.services.IComentariosHotelService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentariosHotel")
public class ComentariosHotelController {

    @Autowired
    private IComentariosHotelService chS;

    @PostMapping
    public void insert(@RequestBody ComentariosHotelDTO dto){
        ModelMapper m = new ModelMapper();
        ComentariosHotel ch=m.map(dto, ComentariosHotel.class);
        chS.insert(ch);
    }

    @GetMapping
    public List<ComentariosHotelDTO> list(){
        return chS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,ComentariosHotelDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{idComentariosHotel}")
    public void delete(@PathVariable("idComentariosHotel")Integer idComentariosHotel){
        chS.delete(idComentariosHotel);
    }
    @PutMapping
    public void goUpdate(@RequestBody ComentariosHotelDTO dto){
        ModelMapper m = new ModelMapper();
        ComentariosHotel ch=m.map(dto, ComentariosHotel.class);
        chS.insert(ch);
    }
    @GetMapping("/hotels/{idHotels}")
    public List<ComentariosHotelDTO> findByHotelId(@PathVariable("idHotels") Integer idHotels) {
        return chS.findByHotelsIdHotels(idHotels).stream()
                .map(x -> {
                    ModelMapper m = new ModelMapper();
                    return m.map(x, ComentariosHotelDTO.class);
                })
                .collect(Collectors.toList());
    }
}
