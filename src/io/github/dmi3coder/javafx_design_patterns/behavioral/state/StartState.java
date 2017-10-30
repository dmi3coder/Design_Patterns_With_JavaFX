package io.github.dmi3coder.javafx_design_patterns.behavioral.state;

/**
 * Created by dim3coder on 10/30/17.
 */
public class StartState implements State {

  @Override
  public void doAction(Context context) {
    System.out.println("player starting playing");
    context.setState(this);
  }

  @Override
  public String toString() {
    return "Start State";
  }
}
