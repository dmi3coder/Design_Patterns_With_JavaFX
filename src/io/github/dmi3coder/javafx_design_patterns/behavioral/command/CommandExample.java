package io.github.dmi3coder.javafx_design_patterns.behavioral.command;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CommandExample extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(root, 300, 275));
    GridPane main = (GridPane) root.lookup("#main");
    MembersDatabase database = new MembersDatabase();
    database.addNewMember("Visitor1");
    database.addNewMember("Visitor2");
    database.addNewMember("Visitor3");
    database.addNewMember("Visitor4");
    database.addNewMember("Marker", User.DIRECTOR);
    database.addNewMember("Waiterer", User.WAITER);
    database.addNewMember("Zucker", User.MANAGER);
    database.displayCurrentStatus();
    database.executeCommand(new CheckingGuestsCommand());
    database.displayCurrentStatus();
    database.executeCommand(new DowngradeManagersCommand());
    database.displayCurrentStatus();
    database.executeCommand(new FireWaitersCommand());
    database.displayCurrentStatus();
    database.executeCommand(
        users -> users.stream().filter(user -> user.getName().equals("Visitor4")).findFirst()
            .ifPresent(user -> user.setName("Dmitriy")));
    database.displayCurrentStatus();
    primaryStage.show();
  }
}
