package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.easytravelapi.entities.DetalleHotel;
@Repository
public interface IDetalleHotelRepository extends JpaRepository<DetalleHotel, Integer> {


}
