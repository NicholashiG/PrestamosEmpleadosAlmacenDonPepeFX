package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx;

import com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.services.DatabaseConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrestamosDonPepeApp extends Application {


    public static void main(String[] args) {
        launch();
        //consultaPrueba();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        nuevaVentana(primaryStage, "inicioSesion.fxml");
    }

    public static void consultaPrueba(){
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM ejemplo";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    System.out.println("Columna1: " + resultSet.getString("id"));
                    System.out.println("Columna2: " + resultSet.getString("nombre"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void nuevaVentana(Stage stage, String url) throws IOException {
        // Cerrar la ventana actual
        stage.close();
        // Abre la nueva ventana
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/uniquindio/basesuno/prestamosempleadosalmacendonpepefx/view/"+url));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Gestión de Solicitudes");
        stage.setScene(scene);
        stage.show();
    }
}