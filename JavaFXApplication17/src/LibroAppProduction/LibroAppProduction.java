/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroAppProduction;

//import java.awt.Image;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Kingsley
 */
public class LibroAppProduction extends Application {
    
    final static String version_number = "0.01a";

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        //initStyles();
        stage.setMinHeight(680);
        stage.setMinWidth(800);
        
        final Scene scene = new Scene(root);
        
        // Set application icon
       // stage.getIcons().add(new Image(""));
        
        // Set application name
        stage.setScene(scene);
        stage.setTitle("LibManager ("+version_number+")");
        stage.show();
    }

    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
