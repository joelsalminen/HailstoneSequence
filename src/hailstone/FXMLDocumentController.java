/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hailstone;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;


/**
 *
 * @author Joel Salminen
 */
public class FXMLDocumentController implements Initializable {
    int inputNumber;
    int min = 2;

    @FXML
    private Button goButton;
    @FXML
    private Label numberInputLabel;
    @FXML
    private Button addOneButton;
    @FXML
    private Button substractOneButton;
    @FXML
    private Button addFiveButton;
    @FXML
    private Button subtractFiveButton;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Html html = new Html();
        /* Calculating hailstone sequence: */
        Hailstone hailstone = new Hailstone(inputNumber);
        
        /* Updating html file: */
        html.CreateHtmlFile(inputNumber, hailstone.GetSteps(), hailstone.GetSecondLargest());
        
        /* Opening a popup window: */
        JOptionPane.showMessageDialog(null,"Calculations completed. Webpage has been updated.");
    }
    
    @FXML
    private void addOne(ActionEvent event) {
        inputNumber++;
        numberInputLabel.setText(Integer.toString(inputNumber));
    }
    
    @FXML
    private void substractOne(ActionEvent event) {
        inputNumber--;
        if (inputNumber < min){ /* this is to avoid negative inputs */
            inputNumber = min;
        }
        numberInputLabel.setText(Integer.toString(inputNumber));
    }

    @FXML
    private void addFive(ActionEvent event) {
        inputNumber += 5;
        numberInputLabel.setText(Integer.toString(inputNumber));
    }

    @FXML
    private void substractFive(ActionEvent event) {
        inputNumber -= 5;
        if (inputNumber < min){ /* this is to avoid negative inputs */
            inputNumber = min;
        }
        numberInputLabel.setText(Integer.toString(inputNumber));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        inputNumber = 5; /* Default value */
        numberInputLabel.setText(Integer.toString(inputNumber));
    }
}
