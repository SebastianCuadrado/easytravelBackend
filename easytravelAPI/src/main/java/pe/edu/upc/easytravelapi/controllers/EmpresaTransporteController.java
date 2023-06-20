package pe.edu.upc.easytravelapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easytravelapi.dtos.EmpresaTransporteDTO;
import pe.edu.upc.easytravelapi.entities.EmpresaTransporte;
import pe.edu.upc.easytravelapi.services.IEmpresaTransporteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/empresatransporte")
public class EmpresaTransporteController {
    @Autowired
    private IEmpresaTransporteService etS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody EmpresaTransporteDTO dto) {
        ModelMapper m = new ModelMapper();
        EmpresaTransporte et = m.map(dto, EmpresaTransporte.class);
        etS.insert(et);
    }
    @GetMapping
    public List<EmpresaTransporteDTO> list() {
        return etS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EmpresaTransporteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        etS.delete(id);
    }

    @GetMapping("/{id}")
    public EmpresaTransporteDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        EmpresaTransporteDTO dto = m.map(etS.listId(id), EmpresaTransporteDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody EmpresaTransporteDTO dto) {
        ModelMapper m = new ModelMapper();
        EmpresaTransporte et = m.map(dto, EmpresaTransporte.class);
        etS.insert(et);
    }
}
