package edu.pe.CNavarro.dao;


import edu.pe.CNavarro.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocenteDao extends JpaRepository<Docente, Long> {
}
