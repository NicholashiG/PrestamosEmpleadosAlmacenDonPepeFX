package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class GeneracionReportesController {

    @FXML
    private Button btnAtras;

    @FXML
    private Button btnDineroMunicipio;

    @FXML
    private Button btnDineroSucursal;

    @FXML
    private Button btnReporteMorosos;

    @FXML
    void atras(ActionEvent event) throws IOException {
        nuevaVentana("paginaPrincipal.fxml");
    }

    @FXML
    void generarReporteDineroPorMunicipio(ActionEvent event) {

    }

    @FXML
    void generarReporteDineroPorSucursal(ActionEvent event) {

    }

    @FXML
    void generarReporteMorosos(ActionEvent event) {

    }

    private void nuevaVentana(String url) throws IOException {
        // Cerrar la ventana actual
        Stage stage = (Stage) btnAtras.getScene().getWindow();
        stage.close();
        // Abre la nueva ventana
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/uniquindio/basesuno/prestamosempleadosalmacendonpepefx/view/"+url));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Gestión de Solicitudes");
        stage.setScene(scene);
        stage.show();
    }
}
