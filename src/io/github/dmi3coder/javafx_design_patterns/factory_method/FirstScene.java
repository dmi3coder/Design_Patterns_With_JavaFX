package io.github.dmi3coder.javafx_design_patterns.factory_method;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FirstScene extends AbstractScene {

  public FirstScene(Parent root, double width, double height) {
    super(root, width, height);
  }

  @Override
  public Button getActionButton() {
    Button button = new Button("Go to second Screen");
    button.setOnAction((event -> {
      try {
        Stage secondStage = new Stage();
        secondStage.setTitle("My New Stage Title");
        secondStage.show();
        Parent root = FXMLLoader.load(getClass().getResource("primary_scene.fxml"));
        SecondScene secondScene = new SecondScene(root, getWidth(), getHeight());
        secondStage.setScene(secondScene);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }));
    return button;
  }
}
