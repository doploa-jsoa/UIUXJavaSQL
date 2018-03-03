/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroAppProduction;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Note the class Record has already been declared within another class
 * Here we move the class out 
 * @author Kingsley
 */
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