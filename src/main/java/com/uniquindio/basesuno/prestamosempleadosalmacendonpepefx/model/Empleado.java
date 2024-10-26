package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
public class Empleado {

    private int idEmpleado;
    private int idUsuario;
    private String nombre;
    private String apellido;
    private int idTipoEmpleado;
    private int idSucursal;

}