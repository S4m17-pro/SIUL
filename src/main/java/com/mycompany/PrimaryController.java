package com.mycompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PrimaryController {

    // Método genérico para cargar la siguiente escena (Login)
    private void loadNextScene(ActionEvent event, String rol) throws IOException {
        // Carga la vista de Login (secondary.fxml)
        FXMLLoader loader = new FXMLLoader(getClass().getResource("secondary.fxml"));
        Scene scene = new Scene(loader.load());

        // Opcional: Obtener el controlador secundario y pasarle el rol.
        SecondaryController controller = loader.getController();
        controller.setRol(rol);

        // Obtiene la ventana (Stage) actual y la cambia
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("SIUL - Login como " + rol);
        stage.show();
    }

    @FXML
    private void handleEstudianteSelection(ActionEvent event) throws IOException {
        loadNextScene(event, "Estudiante");
    }

    @FXML
    private void handleDocenteSelection(ActionEvent event) throws IOException {
        loadNextScene(event, "Docente");
    }
}
