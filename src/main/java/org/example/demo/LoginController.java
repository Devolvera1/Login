package org.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField Usuario;
    @FXML
    private PasswordField Senha;
    @FXML
    private Button Ok;
    @FXML
    private Button Cancelar;

    @FXML
    private void onOkButtonClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("principal.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Tela Principal");
        stage.setScene(new Scene(root));
        stage.show();

        Stage LoginStage = (Stage) Ok.getScene().getWindow();
        LoginStage.close();
    }
    @FXML
    private void onCancelButtonClick() {
            System.exit(0);
        }
    }



