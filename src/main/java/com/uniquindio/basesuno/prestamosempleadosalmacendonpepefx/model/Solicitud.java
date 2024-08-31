package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

public class Solicitud {

    // Variables
    private int idSolicitud;
    private String fechaSolicitud;
    private Empleado empleadoSolicitante;
    private int monto;
    private int periodo;
    private EstadoSolicitud estadoSolicitud;

    // Constructores
    public Solicitud() {
    }

    public Solicitud(int idSolicitud, String fechaSolicitud, Empleado empleadoSolicitante, int monto, int periodo, EstadoSolicitud estadoSolicitud) {
        this.idSolicitud = idSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.empleadoSolicitante = empleadoSolicitante;
        this.monto = monto;
        this.periodo = periodo;
        this.estadoSolicitud = estadoSolicitud;
    }

    // Getters y setters
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Empleado getEmpleadoSolicitante() {
        return empleadoSolicitante;
    }

    public void setEmpleadoSolicitante(Empleado empleadoSolicitante) {
        this.empleadoSolicitante = empleadoSolicitante;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public EstadoSolicitud getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
}
