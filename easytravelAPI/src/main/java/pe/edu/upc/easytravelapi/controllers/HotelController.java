package pe.edu.upc.easytravelapi.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.HotelDTO;
import pe.edu.upc.easytravelapi.entities.Hotel;
import pe.edu.upc.easytravelapi.services.IHotelService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private IHotelService hS;

    @PostMapping
    public void insert(@RequestBody HotelDTO dto){
        ModelMapper m = new ModelMapper();
        Hotel h=m.map(dto, Hotel.class);
        hS.insert(h);
    }

    @GetMapping
    public List<HotelDTO> list(){
    return hS.list().stream().map(x->{
    ModelMapper m= new ModelMapper();
    return m.map(x,HotelDTO.class);
    }).collect(Collectors.toList());
    }
}
