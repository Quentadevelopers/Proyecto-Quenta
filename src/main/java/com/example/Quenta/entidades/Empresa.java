package com.example.Quenta.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Empresa {
    @Column(name="nombre_de_la_empresa", nullable = false, length = 30)
    private String nombreEmpresa;
    @Column(name="direccion_de_la_empresa", nullable = false, length = 30)
    private String direccionEmpresa;
    @Column(name="telefono_de_la_empresa", nullable = false, length = 30)
    private String telefonoEmpresa;
    @Id
    @Column(name="nit_de_la_empresa", nullable = false, length = 30, unique = true)
    private int nitEmpresa;

    public Empresa() {
    }

    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, int nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
}
