package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInsert;

    @FXML
    private Button btnCalcola;

    @FXML
    private TextArea txtAnagrammiCorretti;

    @FXML
    private TextArea txtAnagrammiErrati;

    @FXML
    private Button btnReset;
    
    public boolean controllaCaratteri(String s) {
		
		int i = 0;
		
		for(int n = 0; n<s.length(); n++) {
			int x = s.charAt(n);
			if((x >=97 && x <= 122) || x >=65 && x<=90) {
				i++;
			}
		}
		
		if(i==s.length())
			return true;
		else
			return false;
		
	}

    @FXML
    void doCalcolo(ActionEvent event) {
    	
    	String parola = txtInsert.getText().toLowerCase();
    	
    	txtAnagrammiCorretti.clear();
    	txtAnagrammiErrati.clear();
    	
    	if(controllaCaratteri(parola)==false) {
    		txtAnagrammiErrati.setText("Errore nella scrittura della parola!");
    		return;
    	}
    	
    	for(String s: model.getAnagrammiCorretti(parola)) {
    		txtAnagrammiCorretti.appendText(s+"\n");
    	}
    	
    	for(String s: model.getAnagrammiErrati(parola)) {
    		txtAnagrammiErrati.appendText(s+"\n");
    	}
    	

    }

    @FXML
    void doReset(ActionEvent event) {
    	txtInsert.clear();
    	txtAnagrammiCorretti.clear();
    	txtAnagrammiErrati.clear();

    }

    @FXML
    void initialize() {
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAnagrammiCorretti != null : "fx:id=\"txtAnagrammiCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAnagrammiErrati != null : "fx:id=\"txtAnagrammiErrati\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    
    public void setModel(Model model) {
		this.model = model;
	}
    
}
