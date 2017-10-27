package io.github.dmi3coder.javafx_design_patterns.structural.flyweight;

import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FlyweightExample extends Application {

  Color[] colors = {Color.BLACK, Color.BLUE, Color.GREEN, Color.FIREBRICK, Color.ROSYBROWN,
      Color.BISQUE};

  private ThreadLocalRandom random = ThreadLocalRandom.current();
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

    for (int i = 0; i < 100; i++) {
      Shape shape = ShapeFactory.getShape(getRandomColor());
      shape.draw(context,random.nextDouble(500.0), random.nextDouble(500.0));
    }
    main.add(canvas, 0, 0);
    primaryStage.show();
  }

  public Color getRandomColor() {
    return colors[random.nextInt(colors.length)];
  }
}
