package com.example.issplayground.actions;

import com.example.issplayground.stages.PrimaryStage;

public class Action1 extends Action{
    public Action1() {
        actionName = "action 1 name";
    }

    @Override
    public void executeAction() {
        System.out.println("action 1 text");
    }
}
