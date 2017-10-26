package io.github.dmi3coder.javafx_design_patterns.structural.decorator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DecoratorExample extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(root, 500, 500));
    GridPane main = (GridPane) root.lookup("#main");
    Canvas canvas = new Canvas(500, 500);
    GraphicsContext context = canvas.getGraphicsContext2D();


    //Simple rectangle just draws rectangle on canvas, nothing else
    RectangleShape rectangle = new RectangleShape();
    rectangle.draw(context, 10, 10);

    // Using decorator to dye rectangle
    RectangleShape rectangleShape = new RectangleShape();
    RectangleDecorator decorator = new RectangleDecorator(rectangleShape);
    decorator.setFillColor(Color.GREEN);
    decorator.draw(context, 100, 10);


    main.add(canvas, 0, 0);
    primaryStage.show();
  }
}
