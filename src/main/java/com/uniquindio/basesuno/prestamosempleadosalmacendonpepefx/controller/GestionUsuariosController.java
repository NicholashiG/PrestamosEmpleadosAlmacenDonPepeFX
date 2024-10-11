package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.controller;

import com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.model.Usuario;
import com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.services.UsuariosServicios;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class GestionUsuariosController {

    private UsuariosServicios usuariosServicios = new UsuariosServicios();


    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Agregar valores al ComboBox
        choiceNivelAcceso.setItems(FXCollections.observableArrayList("Principal", "Tesoreria", "Empleado"));

        // (Opcional) Seleccionar un valor predeterminado
        choiceNivelAcceso.getSelectionModel().selectFirst(); // Selecciona el primer elemento por defecto
    }

    @FXML
    void nuevo(ActionEvent event) {

        Random random = new Random();
        int idUsuario = random.nextInt(10000);
        String nivelAcceso = (String) choiceNivelAcceso.getValue();
        String login = txtUsuario.getText();
        String clave = txtContrasenia.getText();

        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setIdUsuario(idUsuario);
        nuevoUsuario.setNivelAcceso(nivelAcceso);
        nuevoUsuario.setLogin(login);
        nuevoUsuario.setClave(clave);

        usuariosServicios.agregarUsuario(nuevoUsuario);

    }

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
    private ChoiceBox<String> choiceNivelAcceso;

    @FXML
    private Label lblInfoUsuario;

    @FXML
    private ListView<?> listViewUsuario;

    @FXML
    private TextField txtContrasenia;

    @FXML
    private TextField txtUsuario;



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
