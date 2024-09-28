package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
public class Solicitud {

    private int idSolicitud;
    private String fechaSolicitud;
    private int idEmpleado;
    private int montoSolicitado;
    private int periodo;
    private String estadoSolicitud;
    private double tasaInteres;
}
