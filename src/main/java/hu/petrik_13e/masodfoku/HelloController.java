package hu.petrik_13e.masodfoku;

import javafx.fxml.FXML;
import javafx.scene.control.*;

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


    public Boolean check(){
        if(m1.getText().equals("") || m2.getText().equals("") || m3.getText().equals("")){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("nem lehetüres");
            alert.showAndWait();
            return Boolean.FALSE;
        }
        try{
            Double.parseDouble(m1.getText());
            Double.parseDouble(m2.getText());
            Double.parseDouble(m3.getText());
            return  Boolean.TRUE;
        }catch (NumberFormatException e){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("számot kell megadni");
            alert.showAndWait();
            return  Boolean.FALSE;
        }

    }
    @FXML
    public void calon() {
        if(check()){
            double b=Double.parseDouble(m2.getText());
            double a=Double.parseDouble(m1.getText());
            double c=Double.parseDouble(m3.getText());
            double d = b*b - 4*a*c;

            if(a == 0 || d < 0) {
                target.setText("nem oldható meg valós számok halmazán");
            } else if (d==0) {


                    double x1 = (-b + Math.sqrt(d))/(2*a);

                    target.setText("x1=x2="+x1);


            } else{
                double x1 = (-b + Math.sqrt(d))/(2*a);
                double x2 = (-b - Math.sqrt(d))/(2*a);
                target.setText("x1="+x1+"\n"+"x2="+x2);
            }
        }



    }
}