package io.github.dmi3coder.javafx_design_patterns.structural.composite;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CompositeExample extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(root, 300, 275));
    AlertableGridPane main = (AlertableGridPane) root.lookup("#main");
    AlertableButton alertableButton = new AlertableButton();
    alertableButton.setText("Alertable button");
    AlertableText alertableText = new AlertableText();
    alertableText.setText("Alertable Text");
    main.add(alertableButton, 0, 0);
    main.add(alertableText, 0, 1);
    final int[] alert = {0};
    alertableButton.setOnAction(event -> main.alert("Alert #"+ (++alert[0])));

    primaryStage.show();
  }
}
