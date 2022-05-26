package edu.pe.CNavarro.dao;


import edu.pe.CNavarro.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface IPersonaDao extends JpaRepository<Persona,Long>  {

}