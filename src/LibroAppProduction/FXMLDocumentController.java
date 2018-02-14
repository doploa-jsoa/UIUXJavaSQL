/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroAppProduction;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
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
      private final SimpleStringProperty fieldValue;
      private final SimpleIntegerProperty fieldValue2;
      private final SimpleIntegerProperty fieldValue3;
      private final SimpleIntegerProperty fieldValue4;
      private final SimpleStringProperty fieldValue5;
     
      Record(String fMonth, String fValue, int fValue2, int fValue3, int fValue4, String fValue5){
          this.fieldMonth = new SimpleStringProperty(fMonth);
          //this.fieldNewDay = new SimpleDoubleProperty(fValue);
          this.fieldValue = new SimpleStringProperty(fValue);
          this.fieldValue2 = new SimpleIntegerProperty(fValue2);
          this.fieldValue3 = new SimpleIntegerProperty(fValue3);
          this.fieldValue4 = new SimpleIntegerProperty(fValue4);
          this.fieldValue5 = new SimpleStringProperty(fValue5);
      }
      
      public String getFieldMonth() {
          return fieldMonth.get();
      }
     
      public String getFieldValue() {
          return fieldValue.get();
      }
      
      public int getFieldValue2() {
          return fieldValue2.get();
      }
      
      public int getFieldValue3() {
          return fieldValue3.get();
      }
      
      public int  getFieldValue4() {
          return fieldValue4.get();
      }
      
      public String getFieldValue5() {
          return fieldValue5.get();
      }
     
     
  }
     
     private ObservableList<Record> dataList =
          FXCollections.observableArrayList(          
              new Record("A Wrinkle In Time", "Author1", 50, 100, 50, "Publisher1"),
              new Record("February", "Author1", 50,200 , 50, "Publisher1"),
              new Record("March", "Author1", 50,50, 50, "Publisher1"),
              new Record("April","Author1", 50, 75, 50, "Publisher1"),
              new Record("May", "Author1", 50,110, 50, "Publisher1"),
              new Record("June", "Author1", 50,300, 50, "Publisher1"),
              new Record("July", "Author1", 50,111, 30, "Publisher1"),
              new Record("August", "Author1", 50, 30, 250, "Publisher1"),
              new Record("September", "Author1", 50, 75, 90, "Publisher1"),
              new Record("October", "Author1", 50,55, 70, "Publisher1"),
              new Record("November", "Author1", 50,225, 60, "Publisher1"),
              new Record("December", "Author1", 50,99, 50, "Publisher1"));
     
     
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
      
      TableColumn columnMonth = new TableColumn("Title");
        columnMonth.setCellValueFactory(
                new PropertyValueFactory<Record,String>("fieldMonth"));
        columnMonth.setMinWidth(60);
        
        TableColumn columnValue1 = new TableColumn("Author");
        columnValue1.setCellValueFactory(
                new PropertyValueFactory<Record,Integer>("fieldValue"));
        columnValue1.setMinWidth(60);
        
        TableColumn columnValue2 = new TableColumn("Pages");
        columnValue2.setCellValueFactory(
                new PropertyValueFactory<Record,Integer>("fieldValue2"));
        columnValue2.setMinWidth(60);
        
        TableColumn columnValue3 = new TableColumn("ISBN");
        columnValue3.setCellValueFactory(
                new PropertyValueFactory<Record,String>("fieldValue3"));
        columnValue3.setMinWidth(60);
 
        TableColumn<Record,Integer> columnValue4 = new TableColumn("Year");
        columnValue4.setCellValueFactory(
                new PropertyValueFactory<Record,Integer>("fieldValue4"));
        columnValue4.setMinWidth(60);
        
        TableColumn columnValue5 = new TableColumn("Publisher");
        columnValue5.setCellValueFactory(
                new PropertyValueFactory<Record,Double>("fieldValue5"));
        columnValue5.setMinWidth(60);

     
      tableView.setItems(dataList);
      //tableView.getColumns().addAll(columnMonth, columnValue);
      tableView.getColumns().setAll(columnMonth, columnValue1, columnValue2, columnValue3, columnValue4, columnValue5);
        // TODO
    }    
    
}
