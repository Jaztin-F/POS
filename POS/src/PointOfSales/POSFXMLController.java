// Justine Francisco IT-2A
package PointOfSales;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author JAZTIN
 */
public class POSFXMLController implements Initializable {

    @FXML
    private Button btntable;
    @FXML
    private Button btnexit;
    
    Scene fxmlFile;
    Parent root;
    
    Stage window;
    @FXML
    private Button btnproduct;
    @FXML
    private Button btndessert;
    @FXML
    private Button btnbeverage;
    @FXML
    private Button btnnorder;
    @FXML
    private Button btnpayment;
    @FXML
    private Button btncorder;
    @FXML
    private AnchorPane ScenePane;
    @FXML
    private Button btnMeal;
 
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void table(ActionEvent event) {
        try{
        openModalWindow("Table.fxml","Tables");
        
        }catch(Exception ex){
        
        
        }
    }
    private void openModalWindow(String resource, String title) throws IOException{
        root = FXMLLoader.load(getClass().getResource(resource));
        fxmlFile =new Scene(root);
        window = new Stage();
        window.setScene(fxmlFile);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setAlwaysOnTop(true);
        window.setIconified(false);
        window.setResizable(false);
        window.initStyle(StageStyle.UNDECORATED);
        window.setTitle(title);
        window.showAndWait();
        
    }

    @FXML
    private void Exit(ActionEvent event) {
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
    alert.setTitle("Exit");
    alert.setHeaderText("Do you really want to EXIT this Application?");


    Optional<ButtonType> result = alert.showAndWait();
    if (result.get() == ButtonType.OK){
    System.exit(0);
} else {
   
}
        
    }

    @FXML
    private void Product(ActionEvent event) {
        
         try{
        openModalWindow("Products.fxml","Tables");
        
        }catch(Exception ex){
        
        
        }
    }

    @FXML
    private void dessert(ActionEvent event) {
        
    
         try{
            Parent root = FXMLLoader.load(getClass().getResource("Dessert.fxml"));
            ScenePane.getChildren().setAll(root);
         
        }catch(Exception ex){
        
        
        }
    }

    @FXML
    private void beverage(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("Beverage.fxml"));
            ScenePane.getChildren().setAll(root);
         
        }catch(Exception ex){
        
        
        }
    }

    @FXML
    private void newOrder(ActionEvent event) {
         try{
        openModalWindow("NewOrder.fxml","Tables");
        
        }catch(Exception ex){
  
        }     
    }

    @FXML
    private void Payment(ActionEvent event) {
         try{
        openModalWindow("Payment.fxml","Tables");
        
        }catch(Exception ex){
        }
    }

    @FXML
    private void CancelOrder(ActionEvent event) {
         try{
        openModalWindow("CancelOrder.fxml","Tables");
        
        }catch(Exception ex){
        
        
        }
    }

    @FXML
    private void Meal(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("Meal.fxml"));
            ScenePane.getChildren().setAll(root);
         
        }catch(Exception ex){
        
        
        }
    }
}
