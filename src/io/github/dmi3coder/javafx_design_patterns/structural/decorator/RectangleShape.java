package io.github.dmi3coder.javafx_design_patterns.structural.decorator;

import javafx.scene.canvas.GraphicsContext;

public class RectangleShape implements Shape {

  @Override
  public void draw(GraphicsContext context,double x, double y) {
    context.fillRect(x, y, 50, 50);
  }
}
