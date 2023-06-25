package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.entities.Intereses;
import pe.edu.upc.easytravelapi.entities.Usuarios;

import java.util.List;

@Repository
public interface IInteresesRepository extends JpaRepository<Intereses, Integer> {
    @Query("from Intereses i where i.usuarios.id =:id")
    List<Intereses> findInteresByUserID(@Param("id")Integer id);

    @Query(value = "SELECT u.nombre,count(i.id_interes) from intereses i \n" +
            "join usuarios u on  i.id = u.id \n" +
            "group by u.nombre ORDER BY COUNT(i.id_interes) DESC", nativeQuery = true)
    List<String[]> getCountInteresesByUsuario();
}
