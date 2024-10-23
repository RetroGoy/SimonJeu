package fr.esgi.simon.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SimonController {

    @FXML
    private Label labelMessage;

    @FXML
    private Button buttonSolo;

    @FXML
    private Button buttonMulti;

    @FXML
    public void choisirModeSolo() {
        // Logique pour démarrer une partie solo
        labelMessage.setText("Mode Solo sélectionné");
    }

    @FXML
    public void choisirModeMulti() {
        // Logique pour démarrer une partie multijoueur
        labelMessage.setText("Mode Multijoueur sélectionné");
    }
}
