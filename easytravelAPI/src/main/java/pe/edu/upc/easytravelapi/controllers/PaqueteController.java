package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.PaqueteDTO;
import pe.edu.upc.easytravelapi.dtos.PaqueteHotelPlaceDTO;
import pe.edu.upc.easytravelapi.entities.Paquete;
import pe.edu.upc.easytravelapi.services.IPaqueteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/paquetes")
public class PaqueteController {
    @Autowired
    private IPaqueteService pS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody PaqueteDTO dto) {
        ModelMapper m = new ModelMapper();
        Paquete p = m.map(dto, Paquete.class);
        pS.insert(p);
    }
    @GetMapping
    public List<PaqueteDTO> list() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PaqueteDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscar")
    public List<PaqueteDTO> BuscarPaquetePorPrecioMayor(@RequestBody float precio) {
        return pS.findPaqueteByPrecioGreaterThan(precio).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PaqueteDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public PaqueteDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PaqueteDTO dto = m.map(pS.listId(id), PaqueteDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody PaqueteDTO dto) {
        ModelMapper m = new ModelMapper();
        Paquete p = m.map(dto, Paquete.class);
        pS.insert(p);
    }
    @GetMapping("/busqueda")
    public List<PaqueteHotelPlaceDTO> getPaquetesByHotelsAndPlace(){
        List<PaqueteHotelPlaceDTO> PaqueteHotelPlaceDTOs = pS.getPaquetesByHotelsAndPlace();
        return PaqueteHotelPlaceDTOs;
    }
}
