package com.example.issplayground.actions;

import com.example.issplayground.stages.PrimaryStage;

public class Action2 extends Action{
    public Action2() {
        actionName = "action 2 name";
    }
    @Override
    public void executeAction() {
        System.out.println("action 2 text");
    }
}
