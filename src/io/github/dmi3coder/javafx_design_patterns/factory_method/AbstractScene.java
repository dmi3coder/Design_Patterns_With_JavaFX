package io.github.dmi3coder.javafx_design_patterns.factory_method;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public abstract class AbstractScene extends Scene {

  private GridPane holder;

  public AbstractScene(Parent root, double width, double height) {
    super(root, width, height);
    holder = (GridPane) root.lookup("#main");
    Button implementationDefinedButton = getActionButton();
    holder.add(implementationDefinedButton, 0, 0);
  }

  public abstract Button getActionButton();
}
