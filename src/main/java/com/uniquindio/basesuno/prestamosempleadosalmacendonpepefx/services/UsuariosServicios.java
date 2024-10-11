package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.services;

import com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model.Usuario;

import java.sql.*;


public class UsuariosServicios {


    public boolean agregarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nivel_acceso, login, clave) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, usuario.getNivelAcceso()); // Establecer el nivel de acceso
            preparedStatement.setString(2, usuario.getLogin());
            preparedStatement.setString(3, usuario.getClave());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Retorna verdadero si se agregó una fila
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Retorna falso si ocurrió un error
        }
    }
}




