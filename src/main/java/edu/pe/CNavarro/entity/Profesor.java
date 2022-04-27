package edu.pe.CNavarro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")

public class Profesor extends Persona{

    @Column(name = "cod_direccion", length = 23)
    private String codProfesor;

    public Profesor() {
    }

    public String getCodDirec() {
        return codProfesor;
    }

    public void setCodDirec(String codDirec) {
        this.codProfesor = getCodDirec();
    }
}
