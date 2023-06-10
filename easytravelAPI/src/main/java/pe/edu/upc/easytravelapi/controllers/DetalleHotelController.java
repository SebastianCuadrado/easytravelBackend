package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.ServiciosDTO;
import pe.edu.upc.easytravelapi.entities.DetalleHotel;

import pe.edu.upc.easytravelapi.services.IDetalleHotelService;


@RestController
@RequestMapping("/detallehotel")
public class DetalleHotelController {
    @Autowired
    private IDetalleHotelService dhS;

    @PostMapping
    public void registrar (@RequestBody ServiciosDTO dto){
        ModelMapper m = new ModelMapper();
        DetalleHotel dh=m.map(dto, DetalleHotel.class);
        dhS.insertar(dh);
    }

    @PutMapping
    public void modificar (@RequestBody ServiciosDTO dto) {
        ModelMapper m= new ModelMapper();
        DetalleHotel dh=m.map(dto, DetalleHotel.class);
        dhS.insertar(dh);

    }
    @DeleteMapping
    public void  eliminar(@PathVariable("id")Integer id){dhS.delete(id);}

}
