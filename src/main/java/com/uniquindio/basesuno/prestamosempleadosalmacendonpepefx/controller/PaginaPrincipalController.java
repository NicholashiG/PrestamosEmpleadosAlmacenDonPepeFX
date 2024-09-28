package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PaginaPrincipalController {

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Label lblSaludo;

    @FXML
    private Button btnPagos;

    @FXML
    private Button btnPrestamos;

    @FXML
    private Button btnReportes;

    @FXML
    private Button btnSolicitudes;

    @FXML
    private Button btnUsuarios;

    @FXML
    void cerrarSesion(ActionEvent event) {
        cerrarVentana();
    }

    @FXML
    void generarReportes(ActionEvent event) throws IOException {
        nuevaVentana("generacionReportes.fxml");
    }

    @FXML
    void gestionarPagos(ActionEvent event) throws IOException {
        nuevaVentana("gestionCuotas.fxml");
    }

    @FXML
    void gestionarPrestamos(ActionEvent event) throws IOException {
        nuevaVentana("gestionPrestamos.fxml");
    }

    @FXML
    void gestionarSolicitudes(ActionEvent event) throws IOException {
        nuevaVentana("gestionSolicitudes.fxml");
    }

    @FXML
    void gestionarUsuarios(ActionEvent event) throws IOException {
        nuevaVentana("gestionUsuarios.fxml");
    }

    private void nuevaVentana(String url) throws IOException {
        // Cerrar la ventana actual
        Stage stage = (Stage) btnSolicitudes.getScene().getWindow();
        stage.close();
        // Abre la nueva ventana
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/uniquindio/basesuno/prestamosempleadosalmacendonpepefx/view/"+url));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    private void cerrarVentana(){
        // Cerrar la ventana actual
        Stage stage = (Stage) btnCerrarSesion.getScene().getWindow();
        stage.close();
    }




}
