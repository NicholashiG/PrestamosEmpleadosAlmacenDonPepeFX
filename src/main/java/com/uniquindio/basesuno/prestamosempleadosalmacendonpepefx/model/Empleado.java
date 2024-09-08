package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import java.util.ArrayList;

public class Empleado {

    // Atributos
    private String nombre;
    private String idEmpleado;
    private Puesto puesto;
    private String sucursal;
    private boolean tienePrestamo;
    private ArrayList<PagoCuota> cuotasPagadas;

    // Constructores


    public Empleado() {
    }

    public Empleado(String nombre, String idEmpleado, Puesto puesto, String sucursal, boolean tienePrestamo, Prestamo prestamo, ArrayList<PagoCuota> cuotasPagadas) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.sucursal = sucursal;
        this.tienePrestamo = tienePrestamo;
        this.cuotasPagadas = cuotasPagadas;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Puesto getTipoEmpleado() {
        return puesto;
    }

    public void setTipoEmpleado(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isTienePrestamo() {
        return tienePrestamo;
    }

    public void setTienePrestamo(boolean tienePrestamo) {
        this.tienePrestamo = tienePrestamo;
    }

    public ArrayList<PagoCuota> getCuotasPagadas() {
        return cuotasPagadas;
    }

    public void setCuotasPagadas(ArrayList<PagoCuota> cuotasPagadas) {
        this.cuotasPagadas = cuotasPagadas;
    }
}
