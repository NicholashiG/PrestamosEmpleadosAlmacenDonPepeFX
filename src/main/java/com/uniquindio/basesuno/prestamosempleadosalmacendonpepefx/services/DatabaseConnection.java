package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://localhost:59485;trustServerCertificate=true;databaseName=PruebaSQL";
    private static final String USER = "usuario";
    private static final String PASSWORD = "usuario";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}