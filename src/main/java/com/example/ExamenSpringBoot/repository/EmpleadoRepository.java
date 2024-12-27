package com.example.ExamenSpringBoot.repository;

import com.example.ExamenSpringBoot.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

    //leer
    @Query(value = "SELECT e.nombre, p.nombre FROM Empleado e JOIN e.proyectos p", nativeQuery = true)
    List<Object[]> findEmpleadosConProyectos();


    //actualizar
    @Modifying
    @Query("UPDATE Empleado e SET e.nombre = :nombre, e.apellido = :apellido WHERE e.id = :id")
    void updateEmpleado(@Param("id") int id, @Param("nombre") String nombre, @Param("apellido") String apellido);


    //eliminar
    @Modifying
    @Query("DELETE FROM Empleado e WHERE e.id = :id")
    void deleteEmpleado(@Param("id") int id);

}
