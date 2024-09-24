package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
public class Prestamo {

    // Variables
    private int idPrestamo;
    private Empleado empleado;
    private int valorPrestamo;
    private String fechaPrestamo;


}
