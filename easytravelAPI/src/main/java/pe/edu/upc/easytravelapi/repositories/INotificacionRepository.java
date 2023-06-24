package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.entities.Notificacion;

import java.util.List;

@Repository
public interface INotificacionRepository extends JpaRepository<Notificacion, Integer> {
    @Query("from Notificacion n where n.intereses.idInteres =:id")
    List<Notificacion> findInteresID(@Param("id")Integer id);

    @Query(value = "SELECT u.nombre, count(n.id_notificacion) from notificacion n \n" +
            "join intereses i on n.id_interes = i.id_interes \n" +
            "join usuarios u on  i.id = u.id \n" +
            "group by u.nombre ORDER BY COUNT(n.id_notificacion) DESC", nativeQuery = true)
    List<String[]> getCountNotificacionByUsuario();
}
