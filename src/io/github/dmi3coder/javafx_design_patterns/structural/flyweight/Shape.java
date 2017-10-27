package io.github.dmi3coder.javafx_design_patterns.structural.flyweight;

import javafx.scene.canvas.GraphicsContext;

public interface Shape {

  void draw(GraphicsContext context, double x, double y);

}
