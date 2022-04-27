package edu.pe.CNavarro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Direccion extends Persona{

    @Column(name = "cod_direccion", length = 23)
    private String codDirec;

    public Direccion() {
    }

    public String getCodDirec() {
        return codDirec;
    }

    public void setCodDirec(String codAdmin) {
        this.codDirec = codAdmin;
    }
}
