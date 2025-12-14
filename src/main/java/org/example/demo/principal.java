package org.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class principal extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Tela Principal");
        stage.setScene(new Scene(new Label("Bem-vindo!"), 400, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
