package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;

@NoArgsConstructor
@Data
@SuperBuilder
public class PagoCuota {

    // Variables
    private int idPagoCuota;
    private int idPrestamo;
    private int numeroCuota;
    private LocalDate fechaPago;
    private float valorCuota;
}
