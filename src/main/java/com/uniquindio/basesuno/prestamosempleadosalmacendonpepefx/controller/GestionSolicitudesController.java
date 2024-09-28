package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class GestionSolicitudesController {

    @FXML
    private Button btnAtras;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnGuardarCambios;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnNuevo;

    @FXML
    private ChoiceBox<?> choiceMeses;

    @FXML
    private Label lblInfoSolicitud;

    @FXML
    private ListView<?> listViewSolicitudes;

    @FXML
    private TextField txtMonto;

    @FXML
    void atras(ActionEvent event) throws IOException {
        nuevaVentana("paginaPrincipal.fxml");
    }

    @FXML
    void editar(ActionEvent event) {

    }

    @FXML
    void eliminar(ActionEvent event) {

    }

    @FXML
    void guardarCambios(ActionEvent event) {

    }

    @FXML
    void limpiar(ActionEvent event) {

    }

    @FXML
    void nuevo(ActionEvent event) {

    }

    @FXML
    void select(MouseEvent event) {

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
