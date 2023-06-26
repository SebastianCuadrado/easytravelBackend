package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.dtos.PaqueteHotelPlaceDTO;
import pe.edu.upc.easytravelapi.entities.Paquete;

import java.util.List;

@Repository
public interface IPaqueteRepository extends JpaRepository<Paquete, Integer> {
    @Query("from Paquete p where p.precio >:pr")
    List<Paquete> findPaqueteByPrecioGreaterThan(@Param("pr")Float pr);

    @Query(value = "SELECT h.nombre, p.precio, dt.name_place from paquetes p \n" +
            "join hotels h on p.id_Hotels = h.id_Hotels \n" +
            "join places dt on p.id_Place = dt.id \n" +
            "order by p.precio asc \n" +
            "limit 5", nativeQuery = true)
    List<String[]> getPaquetesByHotelsAndPlace();
}
