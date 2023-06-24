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

    @Query(value="SELECT h.nombre, count(r.id_reserva) as Reservaciones \n" +
            "from reservas r join paquetes p on r.id_paquete=p.id_paquete \n " +
            "join  hotels h on p.id_hotels=h.id_hotels \n " +
            "GROUP BY h.nombre order by Reservaciones DESC LIMIT 5",nativeQuery = true)
    List<String[]> getCountReservacionesByHotel();
}
