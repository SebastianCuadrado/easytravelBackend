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

}
