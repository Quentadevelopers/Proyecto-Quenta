package com.example.Quenta.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Empleado {
    @Column(name="nombre_del_empleado", nullable = false, length = 30)
    private String nombre;
    @Id
    @Column(name="correo_del_empleado", nullable = false, length = 30, unique = true)
    private String correo;
    @Column(name="empresa_del_empleado", nullable = false, length = 30)
    private String empresaEmpleado;
    @Column(name="rol_del_empleado", nullable = false, length = 30)
    private String rolEmpleado;

    public Empleado() {
    }

    public Empleado(String nombre, String correo, String empresaEmpleado, String rolEmpleado) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
