package edu.pe.CNavarro.dao;


import edu.pe.CNavarro.entity.Direccion;
import edu.pe.CNavarro.entity.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEstudianteDao  extends JpaRepository<Estudiante, Long> {
    List<Estudiante> findByEscuela(Direccion idescuela);

    @Query("SELECT e FROM Estudiante e WHERE e.escuela = :idescuela")
    Page<Estudiante> listEstudianteByPagina(Pageable pageable, @Param("idescuela") Direccion idescuela);

    @Query("SELECT e FROM Estudiante e WHERE e.codigo = :coddni OR e.dni = :coddni")
    Estudiante obtenerPorCodigoOrDni(@Param("coddni") String coddni);
}
