// Justine Francisco IT-2A
package PointOfSales;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class POS extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
     try{
         Parent parentRoot = FXMLLoader.load(getClass().getResource("POSFXML.fxml"));
         primaryStage.setTitle("POS");
         primaryStage.setResizable(false);
         primaryStage.setIconified(false);
         primaryStage.setScene(new Scene(parentRoot));
         primaryStage.initStyle(StageStyle.UNDECORATED);
         primaryStage.show();
     }
     catch(IOException ex){
         System.out.println(ex.getMessage());
         System.exit(0);
     }
    }
    public static void main(String[]args){
        launch(args);
    }
}
