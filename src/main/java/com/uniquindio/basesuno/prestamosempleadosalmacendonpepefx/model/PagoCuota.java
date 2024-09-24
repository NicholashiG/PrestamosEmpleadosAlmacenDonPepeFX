package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
public class PagoCuota {

    // Variables
    private int idCuota;
    private int numeroPrestamo;
    private int numeroCuota;
    private String fechaPago;
    private double valorCuota;
}
