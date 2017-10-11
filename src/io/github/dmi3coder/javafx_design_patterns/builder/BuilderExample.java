package io.github.dmi3coder.javafx_design_patterns.builder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BuilderExample extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(root, 300, 275));
    GridPane main = (GridPane) root.lookup("#main");
    main.add(
        new ButtonBuilder() //Better would be new Button.Builder(), but we use Java, not Kotlin :)
            .withColor(Color.BLUE)
            .withTextColor(Color.WHITE)
            .withText("Button from Builder :P")
            .size(200,100)
            .build(),
        0,
        0);
    primaryStage.show();
  }
}
