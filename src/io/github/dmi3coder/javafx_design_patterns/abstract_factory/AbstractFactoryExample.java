package io.github.dmi3coder.javafx_design_patterns.abstract_factory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AbstractFactoryExample extends Application {

    static AbstractButtonFactory factory;

    static {
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            factory = new LinuxButtonFactory();
        } else factory = new IosButtonFactory();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        GridPane main = (GridPane) root.lookup("#main");
        main.add(factory.getOSButton("test"), 0, 0);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
