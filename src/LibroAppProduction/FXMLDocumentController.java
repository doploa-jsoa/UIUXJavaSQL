/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroAppProduction;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Kingsley
 */
public class FXMLDocumentController implements Initializable {
    
     public class Record{
      private final SimpleStringProperty fieldMonth;
      private final SimpleDoubleProperty fieldValue;
      private final SimpleDoubleProperty fieldValue2;
      private final SimpleDoubleProperty fieldValue3;
     
      Record(String fMonth, double fValue, double fValue2, double fValue3){
          this.fieldMonth = new SimpleStringProperty(fMonth);
          //this.fieldNewDay = new SimpleDoubleProperty(fValue);
          this.fieldValue = new SimpleDoubleProperty(fValue);
          this.fieldValue2 = new SimpleDoubleProperty(fValue2);
          this.fieldValue3 = new SimpleDoubleProperty(fValue3);
      }
      
      public String getFieldMonth() {
          return fieldMonth.get();
      }
     
      public double getFieldValue() {
          return fieldValue.get();
      }
      
      public double getFieldValue2() {
          return fieldValue2.get();
      }
      
      public double getFieldValue3() {
          return fieldValue3.get();
      }
     
  }
     
     private ObservableList<Record> dataList =
          FXCollections.observableArrayList(          
              new Record("January", 100, 50, 70),
              new Record("February", 200 , 50, 70),
              new Record("March", 50, 50, 70),
              new Record("April", 75, 50, 70),
              new Record("May", 110, 50, 70),
              new Record("June", 300, 50, 70),
              new Record("July", 111, 30, 70),
              new Record("August", 30, 250, 70),
              new Record("September", 75, 90, 70),
              new Record("October", 55, 70, 70),
              new Record("November", 225, 60, 70),
              new Record("December", 99, 50, 70));
     
     
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private TableView<Record> tableView = new TableView<>();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
     
      //Group root = new Group();
      
      TableColumn columnMonth = new TableColumn("Month");
        columnMonth.setCellValueFactory(
                new PropertyValueFactory<Record,String>("fieldMonth"));
        columnMonth.setMinWidth(60);
        
        TableColumn columnValue1 = new TableColumn("Value 1");
        columnValue1.setCellValueFactory(
                new PropertyValueFactory<Record,Double>("fieldValue"));
        columnValue1.setMinWidth(60);
        
        TableColumn columnValue2 = new TableColumn("Value 2");
        columnValue2.setCellValueFactory(
                new PropertyValueFactory<Record,Double>("fieldValue2"));
        columnValue2.setMinWidth(60);
        
        TableColumn columnValue3 = new TableColumn("Value 3");
        columnValue3.setCellValueFactory(
                new PropertyValueFactory<Record,Double>("fieldValue3"));
        columnValue3.setMinWidth(60);
 

     
      tableView.setItems(dataList);
      //tableView.getColumns().addAll(columnMonth, columnValue);
      tableView.getColumns().addAll(columnMonth, columnValue1, columnValue2, columnValue3);
        // TODO
    }    
    
}
