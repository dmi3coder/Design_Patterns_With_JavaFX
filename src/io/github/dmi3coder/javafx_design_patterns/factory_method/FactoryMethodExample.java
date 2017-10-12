package io.github.dmi3coder.javafx_design_patterns.factory_method;

import io.github.dmi3coder.javafx_design_patterns.builder.ButtonBuilder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FactoryMethodExample extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("primary_scene.fxml"));
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(root, 300, 275));
    GridPane main = (GridPane) root.lookup("#main");

    primaryStage.show();
  }
}
