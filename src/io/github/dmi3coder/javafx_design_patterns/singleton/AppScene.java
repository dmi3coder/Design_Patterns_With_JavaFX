package io.github.dmi3coder.javafx_design_patterns.singleton;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class AppScene extends Scene {

  private Label label;

  public AppScene(Parent root) {
    super(root);
    label = (Label) root.lookup("#welcome_user");
    label.setText("Welcome, " + UserSingleton.getInstance().getUser());
  }
}
