package com.brh.javafxratespiel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label feedback;
    @FXML
    private TextField number;
    private int targetNumber;

    @FXML
    private void initialize(){
        targetNumber = (int)(Math.random()*100);
    }

    @FXML
    protected void onGuessButton(ActionEvent actionEvent) {

        int guessNumber = Integer.parseInt(number.getText());

        if(guessNumber > targetNumber){
            setFeedback("Deine Zahl ist zu groß");
        }
        else if( guessNumber < targetNumber){
            setFeedback("Deine Nummer ist zu klein");
        }
        else{
            setFeedback("Herzlichen Glückwunsch, Gewonnen!");
            replay();
        }
    }

    private void setFeedback( String fb ){
        feedback.setText(fb);
    }

    private void replay(){
        initialize();
        number.clear();
    }
}
