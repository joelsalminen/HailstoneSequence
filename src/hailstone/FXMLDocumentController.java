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


/**
 *
 * @author Solid
 */
public class FXMLDocumentController implements Initializable {
    int inputNumber;

    @FXML
    private Button goButton;
    @FXML
    private Label numberInput;
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
        System.out.println("You clicked me!");
    }
    @FXML
    private void addOne(ActionEvent event) {
        inputNumber++;
        numberInput.setText(Integer.toString(inputNumber));
    }
    
    @FXML
    private void substractOne(ActionEvent event) {
        inputNumber--;
        if (inputNumber < 1){
            inputNumber = 1;
        }
        numberInput.setText(Integer.toString(inputNumber));
    }

    @FXML
    private void addFive(ActionEvent event) {
        inputNumber += 5;
        numberInput.setText(Integer.toString(inputNumber));
    }

    @FXML
    private void substractFive(ActionEvent event) {
        inputNumber -= 5;
        if (inputNumber < 1){
            inputNumber = 1;
        }
        numberInput.setText(Integer.toString(inputNumber));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Hailstone hail = new Hailstone();
        inputNumber = 1;
        numberInput.setText(Integer.toString(inputNumber));
    }
}
