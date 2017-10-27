package io.github.dmi3coder.javafx_design_patterns.structural.flyweight;

import java.util.HashMap;
import javafx.scene.paint.Color;

public class ShapeFactory {


  public static HashMap<Color, Shape> shapeMap = new HashMap<>();

  public static Shape getShape(Color color) {
    if (shapeMap.containsKey(color)) {
      Shape shape = shapeMap.get(color);
      System.out.println("get shape: "+color);
      return shape;
    } else {
      RectangleShape shape = new RectangleShape(color);
      shapeMap.put(color, shape);
      System.out.println("new shape: "+color);
      return shape;
    }
  }
}
