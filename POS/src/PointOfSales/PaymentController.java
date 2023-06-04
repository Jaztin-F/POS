// Justine Francisco IT-2A
package PointOfSales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JAZTIN
 */
public class PaymentController implements Initializable {

         @FXML
    private ImageView btnclose;
  
    
    Scene fxmlFile;
    Parent root;
    
    Stage window;
    @FXML
    private AnchorPane ScenePane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void Close(MouseEvent event) {
       window = (Stage) ScenePane.getScene().getWindow();
       window.close();
       
    } 
}
