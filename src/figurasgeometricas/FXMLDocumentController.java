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
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

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
    @FXML
    private void Mouse(MouseEvent event) {
        
        double x = event.getX();
        double y = event.getY();
        
        String m = Double.toString(x);
        String n = Double.toString(y);
        
        Ptox.setText(m);
        Ptoy.setText(n);
 
    }
     @FXML
    private void crearCirculo(ActionEvent event) {

        g.setStroke(Color.BLUEVIOLET);
        g.setLineWidth(1);
        g.strokeOval(350, 50, 80, 80);
        
    }
    
    @FXML
    private void crearTrriangulo(ActionEvent event) {
        
    double x[] = {145, 25, 240};
    double y[] = {25, 145, 145};
    

    g.fillPolygon(x, y, 3);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        g = lienzo.getGraphicsContext2D();
        
        double w = lienzo.getWidth();
        double h = lienzo.getHeight();
    }    
    
}
