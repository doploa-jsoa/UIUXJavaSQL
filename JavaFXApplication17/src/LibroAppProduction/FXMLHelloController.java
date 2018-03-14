/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroAppProduction;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
import javafx.collections.ObservableList;

/**
 * FXML Controller class
 *
 * @author Kingsley
 */
public class FXMLHelloController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML 
    private javafx.scene.control.Button noButton;
    
    @FXML 
    private javafx.scene.control.Button yesButton;
    
    
    @FXML
    private void handleButtonActionLogin(ActionEvent event) throws IOException {
        System.out.println("You clicked that 2!");
        
        // get a handle to the stage
    Stage stage = (Stage) yesButton.getScene().getWindow();
    
        //
    ObservableList<Record> x;
    // do what you have to do
    stage.close();
    

    }
    

    
}
