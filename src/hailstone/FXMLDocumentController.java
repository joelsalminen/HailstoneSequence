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
import javafx.scene.control.TextField;


/**
 *
 * @author Solid
 */
public class FXMLDocumentController implements Initializable {
    int inputNumber;

    @FXML
    private Button goButton;
    @FXML
    private TextField numberInput;
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
        
    }
    
    @FXML
    private void substractOne(ActionEvent event) {
    }

    @FXML
    private void addFive(ActionEvent event) {
    }

    @FXML
    private void substractFive(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Hailstone hail = new Hailstone();
        inputNumber = 1;
        numberInput.setText(Integer.toString(inputNumber));
    }
}
