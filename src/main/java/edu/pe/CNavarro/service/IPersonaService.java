package edu.pe.CNavarro.service;



import edu.pe.CNavarro.entity.Persona;

import java.util.List;

public interface IPersonaService {
    List<Persona> listaPersonas();

    //Buscar persona por su dni
    Persona obtenerPersonaByDni(String dni);
}
