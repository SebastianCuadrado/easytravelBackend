package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.ReservaDTO;
import pe.edu.upc.easytravelapi.entities.Reserva;
import pe.edu.upc.easytravelapi.services.IReservaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    @Autowired
    private IReservaService rS;
    @PostMapping
    public void insert(@RequestBody ReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva r = m.map(dto, Reserva.class);
        rS.insert(r);
    }
    @GetMapping
    public List<ReservaDTO> list() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReservaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscar")
    public List<ReservaDTO> BuscarReservaPorIdUsuario(@RequestBody Integer id) {
        return rS.findReservaByUserID(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReservaDTO.class);
        }).collect(Collectors.toList());
    }
}
