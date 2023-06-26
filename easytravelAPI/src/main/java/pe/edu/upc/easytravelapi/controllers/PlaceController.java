package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.PlaceDTO;
import pe.edu.upc.easytravelapi.dtos.PlacePaqueteReservaDTO;
import pe.edu.upc.easytravelapi.entities.Place;
import pe.edu.upc.easytravelapi.services.IPlaceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/places")
public class PlaceController {
    @Autowired
    private IPlaceService pS;
    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping
    public void insert(@RequestBody PlaceDTO dto) {
        ModelMapper m = new ModelMapper();
        Place p = m.map(dto, Place.class);
        pS.insert(p);
    }
    @GetMapping
    public List<PlaceDTO> list() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PlaceDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PlaceDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PlaceDTO dto = m.map(pS.listId(id), PlaceDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody PlaceDTO dto) {
        ModelMapper m = new ModelMapper();
        Place p = m.map(dto, Place.class);
        pS.insert(p);
    }
    @GetMapping("/busqueda")
    public List<PlacePaqueteReservaDTO> getQuantityofPlaces(){
        List<PlacePaqueteReservaDTO> PlacePaqueteReservaDTOs = pS.getQuantityofPlaces();
        return PlacePaqueteReservaDTOs;
    }
}
