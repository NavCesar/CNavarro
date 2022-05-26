package edu.pe.CNavarro.dao;


import edu.pe.CNavarro.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDireccionDao extends JpaRepository<Direccion, Long> {
}
