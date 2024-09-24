package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@NoArgsConstructor
@Data
@SuperBuilder
public class Empleado {

    // Atributos
    private String nombre;
    private String idEmpleado;
    private Puesto puesto;
    private String sucursal;
    private boolean tienePrestamo;
    private ArrayList<PagoCuota> cuotasPagadas;

}