package edu.pe.CNavarro.service;


import edu.pe.CNavarro.entity.Direccion;
import edu.pe.CNavarro.entity.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEstudianteService {
    List<Estudiante> listaEstudiantesByEscuela(Direccion idireccion);


    Page<Estudiante> listaEstudiantesPorPagina(Pageable pageable, Direccion idireccion);


    Estudiante guardarEstudiante(Estudiante estudiante);


    Estudiante obtenerPorCodigoOrDni(String coddni);


    void eliminarEstudiante(Long id);

    void actualizarEstudiante(Estudiante estudiante);
}