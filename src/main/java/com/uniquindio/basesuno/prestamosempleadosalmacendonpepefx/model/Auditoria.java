package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@SuperBuilder
public class Auditoria {
    private int idAuditoria;
    private int idEmpleado;
    private LocalDateTime fechaYHora;
    private AccionesAudit accion;

}
