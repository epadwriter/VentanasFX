package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage primarystage;

    //public static Parent root2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../Fxmls/sample.fxml"));
        primaryStage.setTitle("PALMERA SOFTWARE - CRM - POS - ERP");
        //primaryStage.setFullScreen(true);


        primaryStage.setMaximized(true);
        primaryStage.setScene(new Scene(root, 100,700));
        primaryStage.show();
        primarystage=primaryStage;
    }

    public static void CerrarVentana(Stage stage){
        stage.close();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
