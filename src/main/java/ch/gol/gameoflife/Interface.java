package ch.gol.gameoflife;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Interface {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}