/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
       @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Label myLabel;

    @FXML
    private ProgressBar myProgressBar;
    
double progress;
    @FXML
    void DecreaseProgress(ActionEvent event) {
         progress -=1;
       myProgressBar.setProgress(progress);
      myLabel.setText(Double.toString(progress*1)) ;


    }

    @FXML
    void increaseProgress(ActionEvent event) {
        progress +=1;
       myProgressBar.setProgress(progress);
      myLabel.setText(Double.toString(progress*1)) ;

    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myProgressBar.setStyle("-fx-accent:blue");
        // TODO
    }    
    
}
