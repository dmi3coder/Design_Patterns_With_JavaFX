package io.github.dmi3coder.javafx_design_patterns.singleton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class SingletonExample extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("login_screen.fxml"));
    primaryStage.setTitle("Login screen");
    primaryStage.setScene(new LoginScene(root));

    primaryStage.show();
  }
}
