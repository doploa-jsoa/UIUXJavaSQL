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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Kingsley
 */
public class FXMLDocumentController implements Initializable {
    
     public class Record{
      private final SimpleStringProperty fieldTitle;
      private final SimpleStringProperty fieldAuthor;
      private final SimpleIntegerProperty fieldValuePages;
      private final SimpleIntegerProperty fieldValueISBN;
      private final SimpleIntegerProperty fieldValueYear;
      private final SimpleStringProperty fieldValuePu;
       private final SimpleStringProperty fieldValueURL;
        private final SimpleStringProperty fieldValueSummary;
         private final SimpleStringProperty fieldLanguage;
     
      Record(String fMonth, String fValue, int fValue2, int fValue3, int fValue4, 
              String fValue5,  String fValue6,  String fValue7, String fValue8){
          this.fieldTitle = new SimpleStringProperty(fMonth);
          //this.fieldNewDay = new SimpleDoubleProperty(fValue);
          this.fieldAuthor = new SimpleStringProperty(fValue);
          this.fieldValuePages = new SimpleIntegerProperty(fValue2);
          this.fieldValueISBN = new SimpleIntegerProperty(fValue3);
          this.fieldValueYear = new SimpleIntegerProperty(fValue4);
          this.fieldValuePu= new SimpleStringProperty(fValue5);
          this.fieldValueURL = new SimpleStringProperty(fValue6);
          this.fieldValueSummary = new SimpleStringProperty(fValue7);
          this.fieldLanguage = new SimpleStringProperty(fValue8);
      }
      
  
      public String getFieldTitle() {
          return fieldTitle.get();
      }
     
      public String getFieldAuthor() {
          return fieldAuthor.get();
      }
      
      public int getFieldValuePages() {
          return fieldValuePages.get();
      }
      
      public int getFieldValueISBN() {
          return fieldValueISBN.get();
      }
      
      public int  getFieldValueYear() {
          return fieldValueYear.get();
      }
      
      public String getFieldValuePu() {
          return fieldValuePu.get();
      }
      
      public String getURLValue() {
          return fieldValueURL.get();
      }
      
      public String getSummaryValue() {
          return fieldValueSummary.get();
      }
      
      public String getLanguageValue() {
          return fieldLanguage.get();
      }
     
      
     
  }
     
     private ObservableList<Record> dataList =
          FXCollections.observableArrayList(          
              new Record("A Wrinkle In Time", "Author1", 50, 100, 50, "Publisher1", "a", "b", "en"),
              new Record("February", "Author1", 50,200 , 50, "Publisher2","a", "b", "en"),
              new Record("March", "Author1", 50,50, 50, "Publisher3","a", "b", "en"),
              new Record("April","Author1", 50, 75, 50, "Publisher4","a", "b", "en"),
              new Record("May", "Author1", 50,110, 50, "Publisher5","a", "b", "en"),
              new Record("June", "Author1", 50,300, 50, "Publisher6","a", "b", "en"),
              new Record("July", "Author1", 50,111, 30, "Publisher7","a", "b", "en"),
              new Record("August", "Author1", 50, 30, 250, "Publisher8","a", "b", "en"),
              new Record("September", "Author1", 50, 75, 90, "Publisher9","a", "b", "en"),
              new Record("October", "Author1", 50,55, 70, "Publisher10","a", "b", "en"),
              new Record("November", "Author1", 50,225, 60, "Publisher11","a", "b", "en"),
              new Record("December", "Author1", 50,99, 50, "Publisher12","a", "b", "en"));
     
    
    
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void clickButtonAction(ActionEvent event) {
       Record pos = tableView.getSelectionModel().getSelectedItem();
       System.out.println(pos.fieldTitle+" "+pos.fieldAuthor);
    };
    
   
    
    @FXML
    private TableView<Record> tableView = new TableView<>();
    
    //
    // FXML fields for the Sessions Tab
    //
    
    @FXML
    private TextArea titleHandle;
    
    @FXML
    private TextArea authorHandle;
  
    @FXML
    private TextArea summaryHandle;
    
  
    //
    // FXML fields for the Details Tab
    //
    @FXML
    private TextField detailsTabTitleHandle;
    
    @FXML
    private TextField detailsTabAuthorHandle;
  
    @FXML
    private TextField detailsTabPublisherH;
    
    @FXML
    private TextField detailsTabYearH;
    
    @FXML
    private TextField detailsTabAddressH;
    
    @FXML
    private TextField detailsTabSeriesH;
    
    @FXML
    private TextField detailsTabVolumeH;
    
    @FXML
    private TextField detailsTabEditionH;
    
    @FXML
    private TextField detailsTabPagesH;
    
    @FXML
    private TextField detailsTabISBNH;
    
    @FXML
    private TextField detailsTabURLH;
    
    @FXML
    private TextField detailsTabSummaryH;
     
    @FXML
    private TextField detailsTabLanguageH;
      
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
       Record pos = tableView.getSelectionModel().getSelectedItem();
       System.out.println(pos);
       // int row = pos.getRow();
       // int col = pos.getColumn();
       
       // System.out.println("row"+row);
       // Group root = new Group();
      
      tableView.getSelectionModel().selectedItemProperty().addListener(new SelectionListener()
       {
      @Override
        public void changed(ObservableValue<? extends Record> observable,
                Record oldDoc, Record newDoc) {
            System.out.println("Changing selected row ");
            
            
            Record pos2 = tableView.getSelectionModel().getSelectedItem();
       System.out.println(pos2);
       
            //titleHandle.setText();
            if (oldDoc != null) {
                
                // update information with the sessions tab
                titleHandle.setText(pos2.getFieldTitle());
                authorHandle.setText(pos2.getFieldAuthor());
                
                // update information with the details tab
                detailsTabTitleHandle.setText(pos2.getFieldTitle());
                detailsTabAuthorHandle.setText(pos2.getFieldAuthor());
                detailsTabPublisherH.setText(pos2.getFieldValuePu());
                detailsTabYearH.setText(String.valueOf(pos2.getFieldValueYear()));
                detailsTabISBNH.setText(String.valueOf(pos2.getFieldValueISBN()));
                detailsTabPagesH.setText(String.valueOf(pos2.getFieldValuePages()));
                
                //detailsTabURLH.setText(pos2.getURLValue());
                //detailsTabSummaryH.setText(pos2.getSummaryValue());
                //detailsTabLanguageH.setText(pos2.getLanguageValue());
                
                
            }
            if (newDoc != null) {
                System.out.println("Change has come");
                
            }
        }     
       } 
      );
      
      
      
      TableColumn columnMonth = new TableColumn("Title");
        columnMonth.setCellValueFactory(
                new PropertyValueFactory<Record,String>("fieldTitle"));
        columnMonth.setMinWidth(60);
        
        TableColumn columnValue1 = new TableColumn("Author");
        columnValue1.setCellValueFactory(
                new PropertyValueFactory<Record,Integer>("fieldAuthor"));
        columnValue1.setMinWidth(60);
        
        TableColumn columnValue2 = new TableColumn("Pages");
        columnValue2.setCellValueFactory(
                new PropertyValueFactory<Record,Integer>("fieldValuePages"));
        columnValue2.setMinWidth(60);
        
        TableColumn columnValue3 = new TableColumn("ISBN");
        columnValue3.setCellValueFactory(
                new PropertyValueFactory<Record,String>("fieldValueISBN"));
        columnValue3.setMinWidth(60);
 
        TableColumn<Record,Integer> columnValue4 = new TableColumn("Year");
        columnValue4.setCellValueFactory(
                new PropertyValueFactory<Record,Integer>("fieldValueYear"));
        columnValue4.setMinWidth(60);
        
        TableColumn columnValue5 = new TableColumn("Publisher");
        columnValue5.setCellValueFactory(
                new PropertyValueFactory<Record,Double>("fieldValuePu"));
        columnValue5.setMinWidth(60);

     
      tableView.setItems(dataList);

      tableView.getColumns().setAll(columnMonth, columnValue1, columnValue2, columnValue3, columnValue4, columnValue5);

    }    
    
}

