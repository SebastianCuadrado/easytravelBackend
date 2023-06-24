package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.entities.ComentariosHotel;
import pe.edu.upc.easytravelapi.entities.Servicios;

import java.util.List;

@Repository
public interface IServiciosRepository extends JpaRepository<Servicios,Integer> {
    @Query("SELECT s FROM Servicios s WHERE s.hotels.idHotels = :hotelId")
    List<Servicios> findByHotelsIdHotels(@Param("hotelId") int hotelId);

    @Query(value = "SELECT h.nombre,count(s.id_servicio) as Cant_Servicios from servicios s \n" +
            "join hotels h on  s.id_hotels = h.id_hotels \n" +
            "group by h.nombre order by Cant_Servicios DESC", nativeQuery = true)
    List<String[]> getCountServiciosByHotel();
}
