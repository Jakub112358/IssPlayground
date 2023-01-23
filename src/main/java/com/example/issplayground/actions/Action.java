package com.example.issplayground.actions;

public abstract class Action {
    String actionName;
    public void executeAction(){};

    public String getActionName() {
        return actionName;
    }
}
