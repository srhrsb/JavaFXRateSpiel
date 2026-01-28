package com.brh.javafxratespiel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField number;
    private int targetNumber;

    @FXML
    private void initialize(){
        targetNumber = (int)(Math.random()*100);
    }

    @FXML
    protected void onGuessButton(ActionEvent actionEvent) {

        int guessNumber = Integer.getInteger(number.getText());


    }
}
