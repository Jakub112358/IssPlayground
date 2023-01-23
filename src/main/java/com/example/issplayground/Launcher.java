package com.example.issplayground;

import com.example.issplayground.controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;


public class Launcher extends Application {

    public void start(Stage primaryStage){
        Controller.getInstance().startMenu(primaryStage);
    }

    public static void main(String[] args) {
        launch();
    }
}
