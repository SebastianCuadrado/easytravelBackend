package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.entities.Place;

import java.util.List;

@Repository
public interface IPlaceRepository extends JpaRepository<Place, Integer> {
    @Query(value = "SELECT dt.country AS nombre_destino, COUNT(r.id_reserva) AS cantidad_reservas \n" +
            "FROM places dt \n" +
            "JOIN paquetes p ON dt.id = p.id_place \n" +
            "JOIN reservas r ON p.id_paquete = r.id_paquete \n" +
            "GROUP BY dt.country \n" +
            "Order by cantidad_reservas DESC", nativeQuery = true)
    List<String[]> getQuantityofPlaces();
}
