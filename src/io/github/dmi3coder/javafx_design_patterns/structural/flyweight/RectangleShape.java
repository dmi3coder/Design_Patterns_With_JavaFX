package io.github.dmi3coder.javafx_design_patterns.structural.flyweight;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RectangleShape implements Shape {
  private Color color;

  public RectangleShape(Color color) {
    this.color = color;
  }

  @Override
  public void draw(GraphicsContext context,double x, double y) {
    context.setFill(color);
    context.fillRect(x, y, 50, 50);
  }
}
