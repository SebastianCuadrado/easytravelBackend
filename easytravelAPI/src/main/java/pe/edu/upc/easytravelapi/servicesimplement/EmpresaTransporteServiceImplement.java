package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.EmpresaTransporte;
import pe.edu.upc.easytravelapi.repositories.IEmpresaTransporteRepository;
import pe.edu.upc.easytravelapi.services.IEmpresaTransporteService;

import java.util.List;

@Service
public class EmpresaTransporteServiceImplement implements IEmpresaTransporteService {
    @Autowired
    private IEmpresaTransporteRepository etR;

    @Override
    public void insert(EmpresaTransporte empresaTransporte) {
        etR.save(empresaTransporte);
    }

    @Override
    public List<EmpresaTransporte> list() {
        return etR.findAll();
    }

    @Override
    public void delete(int idEmpresa) {
        etR.deleteById(idEmpresa);
    }

    @Override
    public EmpresaTransporte listId(int idEmpresa) {
        return etR.findById(idEmpresa).orElse(new EmpresaTransporte());
    }
}
