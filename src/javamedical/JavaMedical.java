/* Logan Sines
 * CSC-289-0B01
 * Java Medical Project
 * 3-5-2022
 */

package javamedical;

import JavaMedicalLibrary.JavaMedicalAssets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class JavaMedical extends Application 
        
{
    public static void main(String[] args) 
    {
        launch(args);
    }
   
    @Override
    public void start(Stage primaryStage) throws Exception
    {  
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/javamedical/JavaMedicalFXML.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Java Medical");
            scene.getStylesheets().add(getClass().getResource("/javamedical/JavaMedicalCSS.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show(); 
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
