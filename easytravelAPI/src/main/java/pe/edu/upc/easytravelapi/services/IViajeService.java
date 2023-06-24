package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.dtos.ViajeEmpresaTransporteDTO;
import pe.edu.upc.easytravelapi.dtos.ViajeMesDTO;
import pe.edu.upc.easytravelapi.entities.Viaje;

import java.util.List;

public interface IViajeService {
    public void insert(Viaje viaje);
    public List<Viaje> list();
    public void delete(int idViaje);
    public Viaje listId(int idViaje);
    public List<ViajeEmpresaTransporteDTO> reporte01();
    public List<ViajeMesDTO> reporte02(int month);
}
