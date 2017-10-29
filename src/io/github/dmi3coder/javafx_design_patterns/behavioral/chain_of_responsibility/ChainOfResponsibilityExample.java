package io.github.dmi3coder.javafx_design_patterns.behavioral.chain_of_responsibility;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ChainOfResponsibilityExample extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(root, 300, 275));
    GridPane main = (GridPane) root.lookup("#main");
    UILogger uiLogger = new UILogger(null);
    ErrorLogger errorLogger = new ErrorLogger(uiLogger);
    ConsoleLogger logger = new ConsoleLogger(errorLogger);
    main.add(new ListView<>(uiLogger.getObservableLog()), 0, 0);

    logger.logMessage(AbstractLogger.DEBUG, "debug message :)");
    logger.logMessage(AbstractLogger.ERROR, "error message :)");
    logger.logMessage(AbstractLogger.INFO, "info message :)");
    primaryStage.show();
  }
}
