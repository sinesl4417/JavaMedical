/* Logan Sines
 * CSC-289-0B01
 * Java Medical Project
 * 3-12-2022
 */

package javamedical;

import JavaMedicalLibrary.JavaMedicalAssets;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.Node;

public class JavaMedicalFXMLController implements Initializable 
{
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        //
    }    
    
    public void getEmployeeLogin(ActionEvent event)throws Exception
    {
        root = FXMLLoader.load(getClass().getResource("/javamedical/EmployeeLoginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Java Medical");
        stage.setScene(scene);
        stage.show();
    }
    
    public void getPatientLogin(ActionEvent event)throws Exception
    {
        root = FXMLLoader.load(getClass().getResource("/javamedical/PatientLoginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Java Medical");
        stage.setScene(scene);
        stage.show();
    }
    
    public void exitProgram(ActionEvent event)
    {
        JavaMedicalAssets.exit();
    }
}
