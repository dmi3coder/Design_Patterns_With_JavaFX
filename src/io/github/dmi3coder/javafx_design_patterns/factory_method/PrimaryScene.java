package io.github.dmi3coder.javafx_design_patterns.factory_method;

import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

/**
 * Created by dim3coder on 10/11/17.
 */
public class PrimaryScene extends ColorableScene {

  private GridPane main;

  public PrimaryScene(Parent root, double width, double height) {
    super(root, width, height);
    main = (GridPane) root.lookup("#main");
  }

  @Override
  public void changeSceneColor(Color color) {

  }
}
