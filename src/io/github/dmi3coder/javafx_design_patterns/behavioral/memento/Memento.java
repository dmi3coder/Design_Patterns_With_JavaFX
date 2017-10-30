package io.github.dmi3coder.javafx_design_patterns.behavioral.memento;

/**
 * Created by dim3coder on 10/30/17.
 */
public class Memento {

  private String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
