/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroAppProduction;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableRow;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 *
 * @author Kingsley
 */
public class FXMLDocumentController implements Initializable {
    
     public class Record{
      private final SimpleStringProperty fieldTitle;
      private final SimpleStringProperty fieldSubTitle;
      private final SimpleStringProperty fieldAuthor;
      private final SimpleIntegerProperty fieldValuePages;
      private final SimpleIntegerProperty fieldValueISBN;
      private final SimpleIntegerProperty fieldValueYear;
      private final SimpleStringProperty fieldValuePu;
      private final SimpleStringProperty fieldValueURL;
      private final SimpleStringProperty fieldValueSummary;
      private final SimpleStringProperty fieldLanguage;
     
      Record(String fMonth,  String fValue, String fSubTitle, int fValue2, int fValue3, int fValue4, 
              String fValue5,  String fValue6,  String fValue7, String fValue8){
          this.fieldTitle = new SimpleStringProperty(fMonth);
          this.fieldSubTitle = new SimpleStringProperty(fSubTitle);
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
      
      public String getFieldSubTitle() {
          return fieldSubTitle.get();
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
              new Record("A Wrinkle In Time", "Madeleine L'Engle", "", 240, 74308039, 2017, "Farrar, Straus and Giroux", "a", "b", "en"),
              new Record("The Magicians Nephew",  "C. S. Lewis", "", 202, 439861349 , 1955, "HarperCollins","a", "b", "en"),
         //     new Record("The Vegetarian", "Han Kang", "A Novel", 192, 553448188, 2016, "Hogarth","a", "b", "en"),
         //     new Record("Homegoing","Yaa Gyasi", "", 320, 1101971061, 2016, "Knopf","a", "b", "en"),
         //     new Record("Ghana Must Go", "Taiye Selasi", "", 348, 110, 2013, "Penguin","a", "b", "en"),
         //     new Record("Half of a Yellow Sun", "Chimanda Ngozi Adichie", "",562, 300, 2008, "Anchor","a", "b", "en"),
         //     new Record("Expository Apologetics", "Voddie Baucham Jr", "Answering objections with the power of the word", 208, 111, 2015, "Crossway","a", "b", "en"),
         //     new Record("The Sellout", "Paul Beatty", "", 305, 30, 2015, "Farrar, Straus and Giroux","a", "b", "en"),
        //      new Record("Life Debt ", "Chuck Wendig", "", 514, 1101966955, 2015, "Del Rey  ","a", "b", "en"),
         //     new Record("The Road Less Traveled",  "M. Scott Peck", " A New Psychology of Love, Traditional Values and Spiritual Growth", 322, 0743243153, 2003, "Touchstone","a", "b", "en"),
         //     new Record("Analog and Mixed-Signal Electronics", "Karl Stephan", "", 536, 1118782666, 2015, "Wiley","a", "b", "en"),
         //     new Record("The Little Prince",  "Antoine de Saint-Exupéry", "", 90, 1592324762, 2015, "Seaburn World Classics","a", "b", "en"),
        //      new Record("The Message", "Eugene H. Paterson", "The Bible in Contemporary Language", 928, 1600065945, 2016, "Navpress Publishing Group","a", "b", "en"),
        //      new Record("The Scientist and Engineers Guide to Digital Signal Processing", "Steven W. Smith", "", 626, 966017633, 1997, "California Technical Publishing","a", "b", "en"),
              new Record("We Should All Be Feminists", "Chimanda Ngozi Adichie",  "", 64, 1101911761, 2015, "Vintage","a", "b", "en"));
     
     
    
    
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void clickTableSelectionAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void clickButtonAction(ActionEvent event) {
       Record pos = tableView.getSelectionModel().getSelectedItem();
       System.out.println(pos.fieldTitle+" "+pos.fieldAuthor);
    };
    
   @FXML
    private void clickButtonDeleteBook(ActionEvent event) {
        Record pos = tableView.getSelectionModel().getSelectedItem();
        tableView.getItems().remove(pos);
    };
    
    @FXML
    private void clickNewSessionAction(ActionEvent evet) throws IOException {
                    Parent root = FXMLLoader.load(getClass().getResource("NewSessionWindow.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setFullScreen(false);
                    stage.setScene(scene);
                    stage.show();
            };
    
    @FXML
    private void completeButtonAction(ActionEvent event) {
       for ( int i = 0; i<tableView.getItems().size(); i++) {
    tableView.getItems().clear();
}

               // titleHandle.setText("");
                //authorHandle.setText("");
                  //  subTitleHandle.setText("");
                //summaryHandle.setText(pos2.getSummaryValue());
        //tableView.getItems().clear();
    };
   
    
    @FXML
    public TableView<Record> tableView = new TableView<>();
    
    //
    // FXML fields for the Sessions Tab
    //
    
    @FXML
    private TextArea titleHandle;
    
    @FXML
    private TextArea subTitleHandle;
    
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
    
    //FXML details for the pop up windows tab
    @FXML 
    private Label popUpDetailsWindow; 
      
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
       Record pos = tableView.getSelectionModel().getSelectedItem();
       System.out.println(pos);
       // int row = pos.getRow();
       // int col = pos.getColumn();
       
       // System.out.println("row"+row);
       // Group root = new Group();
       
    tableView.setRowFactory(new Callback<TableView<Record>, TableRow<Record>>() {  
            @Override  
            public TableRow<Record> call(TableView<Record> tableView) {  
                final TableRow<Record> row = new TableRow<>();  
                final ContextMenu contextMenu = new ContextMenu();  
                final MenuItem removeMenuItem = new MenuItem("Remove Book");  
                removeMenuItem.setOnAction(new EventHandler<ActionEvent>() {  
                    @Override  
                    public void handle(ActionEvent event) {  
                        tableView.getItems().remove(row.getItem());  
                    }  
                });  
                contextMenu.getItems().add(removeMenuItem);  
               // Set context menu on row, but use a binding to make it only show for non-empty rows:  
                row.contextMenuProperty().bind(  
                        Bindings.when(row.emptyProperty())  
                        .then((ContextMenu)null)  
                        .otherwise(contextMenu)  
                );  
                return row ;  
            }  
        });  
       
    tableView.setOnMouseClicked(new EventHandler<MouseEvent>()
    {
        @Override
        public void handle(MouseEvent mouseEvent)
        {  
            try {
                if(mouseEvent.getClickCount() == 2)
                {
                    System.out.println("two");
                    System.out.println("You clicked that!");
                    Parent root = FXMLLoader.load(getClass().getResource("FXMLHello.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setFullScreen(false);
                    stage.setScene(scene);
                    stage.show();
                };
                
                
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }; 
        
    });
      
    tableView.getSelectionModel().selectedItemProperty().addListener(new SelectionListener()
    {
        @Override
        public void changed(ObservableValue<? extends Record> observable,
                Record oldDoc, Record newDoc) {
            System.out.println("Changing selected row ");
            
            
            Record pos2 = tableView.getSelectionModel().getSelectedItem();
       System.out.println(pos2);
       
            //titleH andle.setText();
            if (oldDoc != null) {
                
                // update information with the sessions tab
                titleHandle.setText(pos2.getFieldTitle());
                authorHandle.setText(pos2.getFieldAuthor());
                    subTitleHandle.setText(pos2.getFieldSubTitle());
                //summaryHandle.setText(pos2.getSummaryValue());
                
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
        
               TableColumn columnSubTitle = new TableColumn("SubTitle");
        columnSubTitle.setCellValueFactory(
                new PropertyValueFactory<Record,String>("fieldSubTitle"));
        columnSubTitle.setMinWidth(60);
        
        
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

      tableView.getColumns().setAll(columnMonth, columnValue1, columnValue2, columnSubTitle, columnValue3, columnValue4, columnValue5);

    }    
    
}

