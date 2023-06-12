package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.easytravelapi.entities.Actividad;

public interface IActividadRepository extends JpaRepository<Actividad, Integer> {
}
