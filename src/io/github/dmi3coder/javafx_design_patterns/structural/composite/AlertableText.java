package io.github.dmi3coder.javafx_design_patterns.structural.composite;

import javafx.scene.control.Label;

public class AlertableText extends Label implements Alertable {

  @Override
  public void alert(String alertText) {
    System.out.println(this+" alerted with action: "+alertText);
  }
}
