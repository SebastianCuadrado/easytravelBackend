package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.entities.EmpresaTransporte;

@Repository
public interface IEmpresaTransporteRepository extends JpaRepository<EmpresaTransporte, Integer> {

}
