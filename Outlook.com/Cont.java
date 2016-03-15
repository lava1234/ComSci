package com.Browser;

import com.teamdev.jxbrowser.chromium.*;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import com.teamdev.jxbrowser.chromium.events.ProvisionalLoadingEvent;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Tab;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Udeshya on 01/03/2016.
 */
public class Cont implements Initializable{
    @FXML private com.teamdev.jxbrowser.chromium.javafx.BrowserView Web;
    @FXML public TextField ur;
    @FXML private Tab tab;
    @FXML private TabPane mt;
    Button bs = new Button();
    public URL url;

    public void initialize(java.net.URL arg0,
                           java.util.ResourceBundle arg1) {

        Web.getBrowser().addLoadListener(new LoadAdapter() {
            @Override
            public void onProvisionalLoadingFrame(ProvisionalLoadingEvent event) {
                if (event.isMainFrame()) {

                    ur.setText(event.getURL());

                }
            }
            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent event) {
                if (event.isMainFrame()) {
                    tab.setText(event.getBrowser().getTitle());
                }
            }
        });
    }
    public void go() throws IOException {

        try {
            url = new URL(ur.getText());
        } catch (MalformedURLException a){
            url = new URL("https://" + ur.getText());
        }
        Web.getBrowser().loadURL(url.toString());


    }
    public void ref(){ Web.getBrowser().reload();}
    public void back(){
        Web.getBrowser().goBack();
    }
    public void forwards(){
        Web.getBrowser().goForward();
    }
    public void nt() throws IOException{
        mt.getTabs().addAll((Tab) FXMLLoader.load(this.getClass().getResource("t.fxml")));
    }

}
