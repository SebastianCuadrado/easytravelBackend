package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.DetalleHotelDTO;
import pe.edu.upc.easytravelapi.dtos.EmpresaTransporteDTO;
import pe.edu.upc.easytravelapi.dtos.ServiciosDTO;
import pe.edu.upc.easytravelapi.entities.DetalleHotel;

import pe.edu.upc.easytravelapi.services.IDetalleHotelService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/detallehotel")
public class DetalleHotelController {
    @Autowired
    private IDetalleHotelService dhS;

    @PostMapping
    public void registrar (@RequestBody DetalleHotelDTO dto){
        ModelMapper m = new ModelMapper();
        DetalleHotel dh=m.map(dto, DetalleHotel.class);
        dhS.insertar(dh);
    }

    @PutMapping
    public void modificar (@RequestBody DetalleHotelDTO dto) {
        ModelMapper m= new ModelMapper();
        DetalleHotel dh=m.map(dto, DetalleHotel.class);
        dhS.insertar(dh);

    }
    @DeleteMapping
    public void  eliminar(@PathVariable("id")Integer id){dhS.delete(id);}

    @GetMapping
    public List<DetalleHotelDTO> list() {
        return dhS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DetalleHotelDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public DetalleHotelDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        DetalleHotelDTO dto = m.map(dhS.listId(id), DetalleHotelDTO.class);
        return dto;
    }





}
