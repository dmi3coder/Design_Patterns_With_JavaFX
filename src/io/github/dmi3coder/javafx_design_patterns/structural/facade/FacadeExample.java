package io.github.dmi3coder.javafx_design_patterns.structural.facade;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FacadeExample extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(root, 300, 275));
    GridPane main = (GridPane) root.lookup("#main");

    Label label = new Label();
    ListView<String> listView = new ListView<>();
    main.add(label, 0, 0);
    main.add(listView, 0, 1);

    TopicFacade facade = new TopicFacade(label,listView);
    facade.setTopic("cars");
    primaryStage.show();
  }
}
