package io.github.dmi3coder.javafx_design_patterns.behavioral.state;

/**
 * Created by dim3coder on 10/30/17.
 */
public class Context {
  private State state;

  public Context() {
    state = null;
  }


  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
}
