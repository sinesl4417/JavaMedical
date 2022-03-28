/* Logan Sines
 * CSC-289-0B01
 * Java Medical Project
 * 3-12-2022
 */

package javamedical;

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

public class PatientRegistryController implements Initializable 
{
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Label statuslabel;
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField username;
    @FXML
    private TextField phonenumber;
    @FXML
    private TextField hospitalname;
    @FXML
    private TextField doctorlastname;
    @FXML
    private TextField ssnumber;
    @FXML
    private TextField isuranceID;
    @FXML
    private TextField password;
    @FXML
    private TextField passwordconfirm;

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    
    
    public void patientRegister(ActionEvent event)throws Exception
    {
        statuslabel.setText("ERROR: Patient Registry Incomplete");
    }
    
    public void homeScreen(ActionEvent event)throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/javamedical/JavaMedicalFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Java Medical");
        stage.setScene(scene);
        stage.show();
    } 
}
