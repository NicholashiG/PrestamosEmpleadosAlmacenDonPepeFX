package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.dbModel.Niveles;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String apellido;
    private Niveles nivelAcceso;
    private Puesto puesto;
    private float salarioMensual;
    private int idSucursal;
    private String login;
    private String clave;
    private Niveles solicitudes;
}