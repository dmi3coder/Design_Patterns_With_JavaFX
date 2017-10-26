package io.github.dmi3coder.javafx_design_patterns.structural.composite;

import javafx.scene.control.Button;

public class AlertableButton extends Button implements Alertable {

  @Override
  public void alert(String alertableText) {
    System.out.println(this+" alerted with action: "+alertableText);
  }
}
