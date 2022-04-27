package edu.pe.CNavarro.dao;

import edu.pe.CNavarro.entity.Persona;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPersonaDao {

    @Query("SELECT p FROM persona p WHERE p.dni =?1")
    Persona buscarPersona(String dni);
    Persona findByDni(String dni);
    @Query("SELECT p FROM persona p WHERE p.nombre =?1 AND p.apellido = ?2")
    Persona findByNombreAndApellido(String nombre, String apellido);

}