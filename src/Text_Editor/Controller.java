package Text_Editor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Controller {


    public static String rs = "";
    @FXML public TextArea ta;
    @FXML public TextField texts;

    @FXML
    private void bc() throws IOException{

        List<String> lines;
        lines = Arrays.asList(rs);
        Path file = Paths.get(texts.getText());
        Files.write(file, lines, Charset.forName("UTF-8"));
    }



    public void newf()throws IOException{
        
        Stage st = new Stage();
        st.setTitle("Save");
        Scene sc = new Scene(FXMLLoader.load(Controller.class.getResource("save.fxml")),272,210);
        st.setScene(sc);
        st.show();
    }

}
