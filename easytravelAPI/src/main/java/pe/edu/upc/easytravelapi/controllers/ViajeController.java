package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.ViajeDTO;
import pe.edu.upc.easytravelapi.dtos.ViajeEmpresaTransporteDTO;
import pe.edu.upc.easytravelapi.dtos.ViajeMesDTO;
import pe.edu.upc.easytravelapi.entities.Viaje;
import pe.edu.upc.easytravelapi.services.IViajeService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/viaje")
public class ViajeController {
    @Autowired
    private IViajeService vS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody ViajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Viaje v = m.map(dto, Viaje.class);
        vS.insert(v);
    }

    @GetMapping
    public List<ViajeDTO> list() {
        return vS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ViajeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id) {
        vS.delete(id);
    }

    @GetMapping("/{id}")
    public ViajeDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ViajeDTO dto = m.map(vS.listId(id), ViajeDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody ViajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Viaje v = m.map(dto, Viaje.class);
        vS.insert(v);
    }

    @GetMapping("/count")
    public List<ViajeEmpresaTransporteDTO> getViajeCountByEmpresa() {
        List<ViajeEmpresaTransporteDTO> empresaTransporteViajeDTOS = vS.reporte01();
        return empresaTransporteViajeDTOS;
    }

    @GetMapping("/count-month/{month}")
    public List<ViajeMesDTO> getViajeCountByMonth(@PathVariable("month") Integer month) {
        List<ViajeMesDTO> viajeMesDTOS = vS.reporte02(month);
        return viajeMesDTOS;
    }
}
