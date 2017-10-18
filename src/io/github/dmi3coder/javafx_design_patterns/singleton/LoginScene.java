package io.github.dmi3coder.javafx_design_patterns.singleton;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginScene extends Scene {

  private Button button;
  private TextField textField;

  public LoginScene(Parent root) {
    super(root);
    button = (Button) root.lookup("#button");
    textField = (TextField) root.lookup("#field");
    textField.setText(UserSingleton.getInstance().getUser());
    button.setOnAction(event -> {
      String name = textField.getText();
      UserSingleton.getInstance().setUser(name);
      try {
        openMainScreen();
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
  }

  private void openMainScreen() throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("app_screen.fxml"));
    Stage stage = new Stage();
    stage.setScene(new AppScene(root));
    stage.show();
    ((Stage) getWindow()).close();
  }
}
