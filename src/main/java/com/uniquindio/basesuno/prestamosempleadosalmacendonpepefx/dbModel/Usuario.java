package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.dbModel;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
public class Usuario {
    private String login;
    private String password;
    private int idUsuario;


}
