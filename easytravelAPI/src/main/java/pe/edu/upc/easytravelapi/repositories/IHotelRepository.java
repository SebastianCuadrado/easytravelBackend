package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.entities.Hotel;

@Repository
public interface IHotelRepository extends JpaRepository<Hotel,Integer> {
}
