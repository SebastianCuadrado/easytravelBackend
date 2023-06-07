package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.easytravelapi.entities.Viaje;

public interface IViajeRepository extends JpaRepository<Viaje, Integer> {
}
