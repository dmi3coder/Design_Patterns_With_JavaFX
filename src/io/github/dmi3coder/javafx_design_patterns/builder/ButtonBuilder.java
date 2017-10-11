package io.github.dmi3coder.javafx_design_patterns.builder;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/**
 * Created by dim3coder on 10/11/17.
 */
public class ButtonBuilder {
  private Button button;

  public ButtonBuilder() {
    this.button = new Button();
  }

  public ButtonBuilder withColor(Color color){
    button.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
    return this;
  }

  public ButtonBuilder withTextColor(Color color){
    button.setTextFill(color);
    return this;
  }

  public ButtonBuilder withText(String text){
    button.setText(text);
    return this;
  }

  public ButtonBuilder size(double width, double height) {
    button.setPrefSize(width, height);
    return this;
  }


  public Button build(){
    return button;
  }
}
