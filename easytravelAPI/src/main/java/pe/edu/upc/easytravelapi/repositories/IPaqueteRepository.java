package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.entities.Paquete;

import java.util.List;

@Repository
public interface IPaqueteRepository extends JpaRepository<Paquete, Integer> {
    @Query("from Paquete p where p.precio >:pr")
    List<Paquete> findPaqueteByPrecioGreaterThan(@Param("pr")Float pr);
}
