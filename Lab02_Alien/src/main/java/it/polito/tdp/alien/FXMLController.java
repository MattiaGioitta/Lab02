package it.polito.tdp.alien;

import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	public Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInserted;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnClear;

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	txtResult.appendText("Welcome to AlienDictionary v2019.");

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String ts= this.txtInserted.getText();
    	int controllo;
    	try {
   	       controllo=this.model.controlText(ts);   		
   	   }catch (InvalidParameterException ip) {
   		   txtResult.clear();
   		   txtResult.appendText(ip.getMessage());
   		   return;
   		}
    	if(controllo==1) {
    		//this.model.getDictionary().translateWord(ts);
    		txtResult.clear();
    		txtResult.appendText(this.model.getDictionary().translateWord(ts));
    	}
    	else if(controllo==2) {
    		txtResult.clear();
    		
    	}
    	
    	this.txtInserted.clear();
    	

    }

    @FXML
    void initialize() {
        assert txtInserted != null : "fx:id=\"txtInserted\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

    }

	public void setModel(Model model) {
		this.model=model;
		
	}
}
