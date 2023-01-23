package com.example.issplayground.controller;

import com.example.issplayground.actions.Action;
import com.example.issplayground.actions.Action1;
import com.example.issplayground.actions.Action2;
import com.example.issplayground.actions.Action3;
import com.example.issplayground.stages.PrimaryStage;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static Controller instance;

    private List<Action> actionList;

    private Controller() {
        actionList = new ArrayList<>();
        actionList.add(new Action1());
        actionList.add(new Action2());
        actionList.add(new Action3());
        actionList.add(new Action3());
        actionList.add(new Action3());
        actionList.add(new Action3());

    }

    public static Controller getInstance(){
        if (instance == null){
            instance = new Controller();
        }
        return instance;
    }

    public void startMenu(Stage stage){
        PrimaryStage primaryStage = new PrimaryStage(stage, actionList);
        primaryStage.start();
    }

    public void executeAction (int actionNumber){
        actionList.get(actionNumber).executeAction();
    }
}
