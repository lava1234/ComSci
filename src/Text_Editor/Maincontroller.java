package Text_Editor;/**
 * Created by Udeshya on 06/02/2016.
 */

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class Maincontroller extends Application {
    @FXML
    public TextArea ta;
    public static void main(String[] args) {
        launch(args);
    }
    public void newfi()throws IOException{
        Controller.rs = ta.getText();
        Controller.newf();
    }
    public void about() throws IOException{
        Parent root =  FXMLLoader.load(getClass().getResource("about.fxml"));
        Stage abt = new Stage();
        abt.setTitle("About");
        Scene sc = new Scene(root,250,230);
        abt.setScene(sc);
        abt.show();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root =  FXMLLoader.load(getClass().getResource("TEP.fxml"));
        primaryStage.setTitle("Text Editor Program");
        Scene sc = new Scene(root,600,600);
        primaryStage.setScene(sc);
        primaryStage.show();

    }
}
