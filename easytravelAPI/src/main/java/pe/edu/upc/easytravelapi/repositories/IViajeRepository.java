package pe.edu.upc.easytravelapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easytravelapi.entities.Viaje;

import java.util.List;

@Repository
public interface IViajeRepository extends JpaRepository<Viaje, Integer> {
    @Query(value = "SELECT e.nombre, COUNT(v.*) AS total_viajes\n" +
            "FROM Viaje v\n" +
            "JOIN Empresa_Transporte e ON v.id_empresa_transporte = e.id_empresa\n" +
            "GROUP BY e.nombre\n" +
            "ORDER BY total_viajes DESC\n" +
            "LIMIT 5", nativeQuery = true)
    List<String[]> getCountEmpresaTransporteByViaje();
    @Query(value = "SELECT to_char(fecha, 'Month') AS nombre_mes, COUNT(*) AS total_viajes\n" +
            "FROM (\n" +
            "    SELECT fecha_ida AS fecha FROM Viaje\n" +
            "    UNION ALL\n" +
            "    SELECT fecha_vuelta AS fecha FROM Viaje\n" +
            ") AS subquery\n" +
            "WHERE\n" +
            "\tEXTRACT(YEAR FROM fecha) = :month\n" +
            "GROUP BY nombre_mes\n" +
            "ORDER BY nombre_mes", nativeQuery = true)
    List<String[]> getCountViajeByMes(int month);
}
