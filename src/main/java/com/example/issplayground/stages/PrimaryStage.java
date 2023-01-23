package com.example.issplayground.stages;

import com.example.issplayground.actions.Action;
import com.example.issplayground.controller.Controller;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.List;

public class PrimaryStage {

    private final Stage stage;
    private GridPane layout;
    private Scene scene;
    private Text sceneTitle;
    private HBox hbox;

    public PrimaryStage(Stage stage, List<Action> actionList) {
        this.stage = stage;
        createLayout();
        createScene();
        addWelcomeTitle();
        addHBox(actionList);
    }

    public void start() {
        stage.setTitle("Iss app");
        stage.show();
    }

    private void addHBox(List<Action> actionList) {
        hbox = new HBox(10);
        hbox.setAlignment(Pos.TOP_CENTER);
        for (int i = 0; i < actionList.size(); i++) {
            hbox.getChildren().add(createButton(actionList.get(i).getActionName(),i));
        }
        layout.add(hbox, 0, 1);
    }

    private Button createButton(String name, int actionNumber) {
        Button button = new Button(name);
        button.setOnAction(actionEvent -> Controller.getInstance().executeAction(actionNumber));
        return button;
    }

    private void addWelcomeTitle() {
        StackPane stackPane = new StackPane();
        sceneTitle = new Text("Welcome to ISS app");
        sceneTitle.setId("scenetitle");
        stackPane.getChildren().add(sceneTitle);
        layout.add(stackPane, 0, 0);
    }

    private void createLayout() {
        layout = new GridPane();
        layout.setId("layout");
        layout.setAlignment(Pos.TOP_CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(15, 15, 15, 15));
        layout.setGridLinesVisible(true);
    }

    private void createScene() {
        scene = new Scene(layout, 640, 482);
        stage.setScene(scene);
        scene.getStylesheets().add(PrimaryStage.class.getResource("PrimaryStage.css").toExternalForm());
    }

}
