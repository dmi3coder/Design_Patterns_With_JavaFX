package io.github.dmi3coder.javafx_design_patterns.structural.decorator;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RectangleDecorator implements Shape {

  private final RectangleShape shape;
  private Color fillColor;

  public RectangleDecorator(RectangleShape shape) {
    this.shape = shape;
  }


  @Override
  public void draw(GraphicsContext context, double x, double y) {
    context.setFill(fillColor);
    shape.draw(context, x, y);
    context.setFill(Color.BLACK);
  }


  public void setFillColor(Color fillColor) {
    this.fillColor = fillColor;
  }
}
