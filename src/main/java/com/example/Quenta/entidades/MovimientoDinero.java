package com.example.Quenta.entidades;

import javax.persistence.*;

@Entity
@Table(name="movimiento_de_dinero")
public class MovimientoDinero {
    @Column(name= "monto_del_movimiento", nullable = false)
    private int montoMovimiento;
    @Column(name="concepto_del_movimiento", nullable = false)
    private String conceptoMovimiento;
    @Id
    @Column(name="encargado_del_movimiento", nullable = false)
    private String encargadoMovimiento;

    @ManyToOne
    @JoinColumn(name="nombre")
    Empleado emple;
    @ManyToOne
    @JoinColumn(name="empresa")
    Empresa emp;

    public MovimientoDinero() {
    }

    public MovimientoDinero(int montoMovimiento, String conceptoMovimiento, String encargadoMovimiento, Empleado emple, Empresa emp) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.encargadoMovimiento = encargadoMovimiento;
        this.emple = emple;
        this.emp = emp;
    }

    public int getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getEncargadoMovimiento() {
        return encargadoMovimiento;
    }

    public void setEncargadoMovimiento(String encargadoMovimiento) {
        this.encargadoMovimiento = encargadoMovimiento;
    }

    public Empleado getEmple() {
        return emple;
    }

    public void setEmple(Empleado emple) {
        this.emple = emple;
    }

    public Empresa getEmp() {
        return emp;
    }

    public void setEmp(Empresa emp) {
        this.emp = emp;
    }
}
