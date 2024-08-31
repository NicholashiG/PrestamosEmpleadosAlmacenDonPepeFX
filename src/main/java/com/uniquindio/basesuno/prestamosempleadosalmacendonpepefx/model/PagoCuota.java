package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

public class PagoCuota {

    // Variables
    private int idCuota;
    private int numeroPrestamo;
    private int numeroCuota;
    private String fechaPago;
    private double valorCuota;

    // Constructores
    public PagoCuota() {
    }

    public PagoCuota(int idCuota, int numeroPrestamo, int numeroCuota, String fechaPago, double valorCuota) {
        this.idCuota = idCuota;
        this.numeroPrestamo = numeroPrestamo;
        this.numeroCuota = numeroCuota;
        this.fechaPago = fechaPago;
        this.valorCuota = valorCuota;
    }

    // Getters y setters

    public int getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(int idCuota) {
        this.idCuota = idCuota;
    }

    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }
}
