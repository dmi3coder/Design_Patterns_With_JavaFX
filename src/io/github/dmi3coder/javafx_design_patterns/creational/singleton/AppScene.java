package io.github.dmi3coder.javafx_design_patterns.creational.singleton;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AppScene extends Scene {

  private Label label;
  private Button reloginButton;

  public AppScene(Parent root) {
    super(root);
    label = (Label) root.lookup("#welcome_user");
    reloginButton = (Button) root.lookup("#relogin_button");
    label.setText("Welcome, " + UserSingleton.getInstance().getUser());
    reloginButton.setOnAction(event -> {
      Parent loginRoot = null;
      try {
        loginRoot = FXMLLoader.load(getClass().getResource("login_screen.fxml"));
      } catch (IOException ignored) {
      }
      Stage stage = new Stage();
      stage.setScene(new LoginScene(loginRoot));
      stage.show();
      ((Stage) getWindow()).close();
    });
  }
}
