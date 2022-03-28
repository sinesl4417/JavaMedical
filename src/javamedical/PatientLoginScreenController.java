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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PatientLoginScreenController implements Initializable 
{
    @FXML
    private Label loginstatus;
    @FXML
    private TextField enterusername;
    @FXML
    private TextField enterpassword;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
    public void patientLogin(ActionEvent event) throws Exception
    {
        if (enterusername.getText().equals("user") && enterpassword.getText().equals("password"))
        {
            Parent root = FXMLLoader.load(getClass().getResource("/javamedical/PatientHomepage.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else
        {
            loginstatus.setText("Incorrect Username/Password");
        }
    }
    
    public void patientRegister(ActionEvent event)throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/javamedical/PatientRegistry.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Java Medical");
        stage.setScene(scene);
        stage.show();
    }
    
    public void homeScreen(ActionEvent event)throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/javamedical/JavaMedicalFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Java Medical");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 
    
}
