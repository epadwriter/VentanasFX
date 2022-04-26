package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Main;


import static java.util.Objects.*;
import static sample.Main.primarystage;
//import static sample.Main.primaryStage2;
//import static sample.Main.primarystage;

public class Controller {

    @FXML
    private Button BtnBar1;



    public void CallLogin(ActionEvent event) {
        try{
            Parent root2 = FXMLLoader.load(requireNonNull(getClass().getResource("/Fxmls/LoginForm.fxml")));
            Stage stageSample2 = new Stage();
            stageSample2.setTitle("INICIAR SESIÓN");
            stageSample2.setScene(new Scene(root2));
            //stageSample2.initModality(Modality.WINDOW_MODAL);
            stageSample2.initModality(Modality.APPLICATION_MODAL);
            //stageSample2.initOwner(primarystage);
            stageSample2.show();
            //stageSample2.showAndWait();
            Main.CerrarVentana(primarystage);

        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
