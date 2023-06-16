package pe.edu.upc.easytravelapi.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.entities.ComentariosHotel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface IComentariosHotelRepository extends JpaRepository<ComentariosHotel,Integer> {
    @Query("SELECT c FROM ComentariosHotel c WHERE c.hotels.idHotels = :hotelId")
    List<ComentariosHotel> findByHotelsIdHotels(@Param("hotelId") int hotelId);
}
