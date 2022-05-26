package edu.pe.CNavarro.service.imple;


import edu.pe.CNavarro.dao.IPersonaDao;
import edu.pe.CNavarro.entity.Persona;
import edu.pe.CNavarro.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listaPersonas() {

        List<Persona> personaList = this.personaDao.findAll();

        for (Persona persona: personaList){
            System.out.println(persona.toString());
        }

        return personaList;
    }

    @Override
    public Persona obtenerPersonaByDni(String dni) {
        return null;
    }
}
