package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.entities.Reserva;

import java.util.List;
@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {
    @Query("from Reserva r where r.usuario.id =:id")
    List<Reserva> findReservaByUserID(@Param("id")Integer id);
}
