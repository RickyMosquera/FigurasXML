/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;

/**
 *
 * @author ricky.mosquera
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label Ptox;
    @FXML
    private Label Ptoy;
    @FXML
    private Canvas lienzo;
    private GraphicsContext g;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       // System.out.println("You clicked me!");
       // label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
