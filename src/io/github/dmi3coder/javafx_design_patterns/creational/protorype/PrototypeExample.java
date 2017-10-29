package io.github.dmi3coder.javafx_design_patterns.creational.protorype;

import java.util.List;
import java.util.stream.Collectors;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class PrototypeExample extends Application {

  private int loadCount = 0;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(root));
    ListView<String> listView = (ListView<String>) root.lookup("#list");
    listView.setEditable(true);
    Label label = ((Label) root.lookup("#time"));
    Button load_button = (Button) root.lookup("#load_button");
    Button clearButton = (Button) root.lookup("#clear_button");
    CheckBox enablePrototype = (CheckBox) root.lookup("#prototype_checkbox");

    load_button.setOnAction(a -> {
      long startTime = System.nanoTime();
      List<String> data;
      if (!enablePrototype.isSelected()) {
        data = CachedData.getData();
      } else {
        data = ReallyHardToLoadData.getAuthors().stream().map(Author::getNickname).collect(
            Collectors.toList());
      }
      ObservableList<String> items2 = FXCollections.observableArrayList(data);
      listView.setItems(items2);
      long endTime = System.nanoTime();
      loadCount++;
      label.setText("Load took " + (endTime - startTime) + " nanoseconds, Reload #" + loadCount);
    });
    clearButton.setOnAction(a -> listView.setItems(null));
    primaryStage.show();
  }
}
