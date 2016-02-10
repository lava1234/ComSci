package Text_Editor;/**
 * Created by Udeshya on 06/02/2016.
 */

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.lang.Object.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

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
    public void choose(){
        Stage stage = new Stage();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("JNA", "*.jna")
        );
        File text = fileChooser.showOpenDialog(stage);


        String fileName = FileUtils.readFileToString(file);
        String line = null;

        try {
            FileReader fileReader =
                    new FileReader(fileName);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }

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
