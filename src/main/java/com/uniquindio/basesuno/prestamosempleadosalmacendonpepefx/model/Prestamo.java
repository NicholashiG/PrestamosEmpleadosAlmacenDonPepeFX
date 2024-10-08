package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;

@NoArgsConstructor
@Data
@SuperBuilder
public class Prestamo {

    private int idPrestamo;
    private int idSolicitud;
    private int valorPrestamo;
    private LocalDate fechaPrestamo;
}
