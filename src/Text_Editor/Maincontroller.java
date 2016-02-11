package Text_Editor;/**
 * Created by Udeshya on 06/02/2016.
 */

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.lang.Object.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileStore;
import java.nio.file.Files;

public class Maincontroller extends Application {
    @FXML
    public TextArea ta;
    public static void main(String[] args) {
        launch(args);
    }
    public void about() throws IOException{
        Parent root =  FXMLLoader.load(getClass().getResource("about.fxml"));
        Stage abt = new Stage();
        abt.setTitle("About");
        Scene sc = new Scene(root);
        abt.setScene(sc);
        abt.show();
    }
    public void choose(){
        Stage stage = new Stage();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JNA", "*.jna"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        File text = fileChooser.showOpenDialog(stage);

    }


    public void save() throws IOException{
        Stage stage = new Stage();
        FileChooser fc = new FileChooser();
        fc.setTitle("Save file");
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JNA", "*.jna")
        );


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
