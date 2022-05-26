package edu.pe.CNavarro.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Estudiante {
    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 8)
    private String serie;

    @Column(name = "estado_egreso", length = 5)
    private String estadoEgreso;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Direccion direccion;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie, String estadoEgreso, Direccion direccion) {
        this.codigo = codigo;
        this.serie = serie;
        this.estadoEgreso = estadoEgreso;
        this.direccion = direccion;
    }

    public Estudiante(Long idpersona, String codigo, String serie, String estadoEgreso, Direccion direccion) {
        this.codigo = codigo;
        this.serie = serie;
        this.estadoEgreso = estadoEgreso;
        this.direccion = direccion;
    }
    public Estudiante(String nombre, String apellido, String edad, String sexo, String dni, String telefono, Date fechaNacimiento, String codigo, String serie, String estadoEgreso, Direccion direccion) {
        this.codigo = codigo;
        this.serie = serie;
        this.estadoEgreso = estadoEgreso;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEstadoEgreso() {
        return estadoEgreso;
    }

    public void setEstadoEgreso(String estadoEgreso) {
        this.estadoEgreso = estadoEgreso;
    }

}
