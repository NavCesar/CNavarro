package edu.pe.CNavarro.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dirrecion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddireccion;

    private String codigo;



    public Direccion() {
    }

    public Direccion(Long iddireccion) {
        this.iddireccion = iddireccion;
    }

    public Direccion(String codigo) {
        this.codigo = codigo;
    }

    public Long getIdescuela() {
        return iddireccion;
    }

    public void setIdescuela(Long iddireccion) {
        this.iddireccion = iddireccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }}
