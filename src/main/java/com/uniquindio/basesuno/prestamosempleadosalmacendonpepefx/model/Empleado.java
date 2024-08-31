package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import java.util.ArrayList;

public class Empleado {

    // Atributos
    private String nombre;
    private String idEmpleado;
    private TipoEmpleado tipoEmpleado;
    private String sucursal;
    private String municipio;
    private boolean tienePrestamo;
    private Prestamo prestamo;
    private ArrayList<PagoCuota> cuotasPagadas;

    // Constructores


    public Empleado() {
    }

    public Empleado(String nombre, String idEmpleado, TipoEmpleado tipoEmpleado, String sucursal, String municipio, boolean tienePrestamo, Prestamo prestamo, ArrayList<PagoCuota> cuotasPagadas) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.tipoEmpleado = tipoEmpleado;
        this.sucursal = sucursal;
        this.municipio = municipio;
        this.tienePrestamo = tienePrestamo;
        this.prestamo = prestamo;
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

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public boolean isTienePrestamo() {
        return tienePrestamo;
    }

    public void setTienePrestamo(boolean tienePrestamo) {
        this.tienePrestamo = tienePrestamo;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public ArrayList<PagoCuota> getCuotasPagadas() {
        return cuotasPagadas;
    }

    public void setCuotasPagadas(ArrayList<PagoCuota> cuotasPagadas) {
        this.cuotasPagadas = cuotasPagadas;
    }
}
