package io.github.dmi3coder.javafx_design_patterns.behavioral.state;

/**
 * Created by dim3coder on 10/30/17.
 */
public class StateExample {

  public static void main(String[] args) {
    Context context = new Context();
    StartState startState = new StartState();
    startState.doAction(context);
    System.out.println(context.getState().toString());
    StopState stopState = new StopState();
    stopState.doAction(context);
    System.out.println(context.getState().toString());
  }

}
