package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class GestionCuotasController {

    @FXML
    private Button btnAtras;

    @FXML
    private Button btnPagarCuota;

    @FXML
    private Label lblInfoCuota;

    @FXML
    private ListView<?> listViewCuotas;

    @FXML
    void atras(ActionEvent event) throws IOException {
        nuevaVentana("paginaPrincipal.fxml");
    }

    @FXML
    void pagarCuota(ActionEvent event) {

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
        stage.setScene(scene);
        stage.show();
    }
}
