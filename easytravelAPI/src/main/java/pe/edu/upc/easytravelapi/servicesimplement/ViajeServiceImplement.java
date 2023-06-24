package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.dtos.ViajeEmpresaTransporteDTO;
import pe.edu.upc.easytravelapi.dtos.ViajeMesDTO;
import pe.edu.upc.easytravelapi.entities.Viaje;
import pe.edu.upc.easytravelapi.repositories.IViajeRepository;
import pe.edu.upc.easytravelapi.services.IViajeService;

import java.util.ArrayList;
import java.util.List;
@Service
public class ViajeServiceImplement implements IViajeService {
    @Autowired
    private IViajeRepository vR;
    @Override
    public void insert(Viaje viaje) {
        vR.save(viaje);
    }

    @Override
    public List<Viaje> list() {
        return vR.findAll();
    }

    @Override
    public void delete(int idViaje) {
        vR.deleteById(idViaje);
    }

    @Override
    public Viaje listId(int idViaje) {
        return vR.findById(idViaje).orElse(new Viaje());
    }

    @Override
    public List<ViajeEmpresaTransporteDTO> reporte01() {
        List<String[]> countViajeByEmpresatransporte = vR.getCountEmpresaTransporteByViaje();
        List<ViajeEmpresaTransporteDTO> viajeEmpresaTransporteDTOS = new ArrayList<>();

        for (String[] data : countViajeByEmpresatransporte) {
            ViajeEmpresaTransporteDTO dto = new ViajeEmpresaTransporteDTO();
            dto.setNameEmpresa(data[0]);
            dto.setViajeCount(Integer.parseInt(data[1]));
            viajeEmpresaTransporteDTOS.add(dto);
        }
        return viajeEmpresaTransporteDTOS;
    }

    @Override
    public List<ViajeMesDTO> reporte02(int month) {
        List<String[]> countViajeByMonth = vR.getCountViajeByMes(month);
        List<ViajeMesDTO> viajeMesDTOS = new ArrayList<>();

        for (String[] data : countViajeByMonth) {
            ViajeMesDTO dto = new ViajeMesDTO();
            dto.setNameMonth(data[0]);
            dto.setViajeCount(Integer.parseInt(data[1]));
            viajeMesDTOS.add(dto);
        }
        return viajeMesDTOS;
    }
}
