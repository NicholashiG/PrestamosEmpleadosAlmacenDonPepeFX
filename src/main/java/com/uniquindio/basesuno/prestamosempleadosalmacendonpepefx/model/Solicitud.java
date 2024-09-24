package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
public class Solicitud {

    // Variables
    private int idSolicitud;
    private String fechaSolicitud;
    private Empleado empleadoSolicitante;
    private int monto;
    private int periodo;
    private EstadoSolicitud estadoSolicitud;
    private double tasaInteres;
}
