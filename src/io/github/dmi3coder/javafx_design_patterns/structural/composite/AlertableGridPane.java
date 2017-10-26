package io.github.dmi3coder.javafx_design_patterns.structural.composite;

import javafx.scene.layout.GridPane;

public class AlertableGridPane extends GridPane implements Alertable {

  @Override
  public void alert(String alertText) {
    getChildren().forEach(node -> ((Alertable) node).alert(alertText));

  }
}
