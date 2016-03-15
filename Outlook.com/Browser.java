package com.Browser;/**
 * Created by user on 01/03/2016.
 */

import com.teamdev.jxbrowser.chromium.events.*;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.*;
import java.net.URL;

public class Browser extends Application {
    javafx.geometry.Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
    @FXML private com.teamdev.jxbrowser.chromium.javafx.BrowserView Web;
    @FXML public TextField ur;
    @FXML public Button nt;


    public static void main(String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws IOException{
        Parent root =  FXMLLoader.load(getClass().getResource("b.fxml"));
        primaryStage.setTitle("JChrome Browser");
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
        primaryStage.show();

        
    }

}
