package io.github.dmi3coder.javafx_design_patterns.factory_method;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

/**
 * Created by dim3coder on 10/11/17.
 */
public abstract class ColorableScene extends Scene {

  public ColorableScene(Parent root, double width, double height) {
    super(root, width, height);
  }

  public abstract void changeSceneColor(Color color);
}
