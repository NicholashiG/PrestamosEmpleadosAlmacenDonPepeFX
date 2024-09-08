package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

public class Prestamo {

    // Variables
    private int idPrestamo;
    private Empleado empleado;
    private int valorPrestamo;
    private String fechaPrestamo;

    // Constructores

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, Empleado empleado, int valorPrestamo, String fechaPrestamo) {
        this.idPrestamo = idPrestamo;
        this.empleado = empleado;
        this.valorPrestamo = valorPrestamo;
        this.fechaPrestamo = fechaPrestamo;
    }

    // Getters y setters

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(int valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
}
