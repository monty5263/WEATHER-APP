package com.example.weatherapp.weather_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(createContents(), 400, 200);
        stage.setScene(scene);
        stage.show();





    }
    private Region createContents(){
        HBox results = new HBox(new Label("Username:"), new TextField("Username"));
        results.setSpacing(6);
        results.setPadding(new Insets(0,0,0,50));

        return results;
    }

    public static void main(String[] args) {
        launch();
    }
}