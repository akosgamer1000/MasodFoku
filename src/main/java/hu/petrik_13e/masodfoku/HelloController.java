package hu.petrik_13e.masodfoku;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField m1;
    @FXML
    private TextField m2;
    @FXML
    private TextField m3;
    @FXML
    private TextArea target;


    @FXML
    private Button cal;

    @FXML
    public void calon() {
        double b=Double.parseDouble(m2.getText());
        double a=Double.parseDouble(m1.getText());
        double c=Double.parseDouble(m3.getText());
        double d = b*b - 4*a*c;

        if(a == 0 || d < 0) {
            target.setText("nem oldható meg valós számok halmazán");
        }
        else{
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            target.setText("x1="+x1+"\n"+"x2="+x2);
        }


    }
}