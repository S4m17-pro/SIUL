package com.mycompany;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {

    @FXML
    private Label rolLabel; // Etiqueta para indicar el rol seleccionado

    @FXML
    private TextField userField;

    @FXML
    private TextField passwordField;

    @FXML
    private Label messageLabel;

    private String rolActual;

    /** * Método llamado desde PrimaryController para establecer el rol.
     */
    public void setRol(String rol) {
        this.rolActual = rol;
        rolLabel.setText("Login SIUL como: " + rol);
    }

    @FXML
    private void handleLoginButton() {
        String user = userField.getText();
        String pass = passwordField.getText();

        // Lógica de validación basada en el rol
        if (rolActual.equals("Estudiante")) {
            // Lógica de validación para estudiante
            if (user.startsWith("E") && pass.equals("123")) {
                messageLabel.setText("Estudiante: ¡Acceso concedido!");
                // TODO: Cargar la vista principal del Estudiante (MainController, por ejemplo)
            } else {
                messageLabel.setText("Credenciales de Estudiante inválidas.");
            }
        } else if (rolActual.equals("Docente")) {
            // Lógica de validación para docente
            if (user.startsWith("D") && pass.equals("987")) {
                messageLabel.setText("Docente: ¡Acceso concedido!");
                // TODO: Cargar la vista principal del Docente
            } else {
                messageLabel.setText("Credenciales de Docente inválidas.");
            }
        }
    }
}