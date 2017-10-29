package io.github.dmi3coder.javafx_design_patterns.creational.factory_method;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SecondScene extends AbstractScene {

  public SecondScene(Parent root, double width, double height) {
    super(root, width, height);
  }

  @Override
  public Button getActionButton() {
    Button button = new Button("Go back");
    button.setOnAction(event -> ((Stage) button.getScene().getWindow()).close());
    return button;
  }
}
