package com.example.issplayground.actions;

import com.example.issplayground.stages.PrimaryStage;

public class Action3 extends Action{
    public Action3() {
        actionName = "action 3 name";
    }
    @Override
    public void executeAction() {
        System.out.println("action 3 text");
    }
}
