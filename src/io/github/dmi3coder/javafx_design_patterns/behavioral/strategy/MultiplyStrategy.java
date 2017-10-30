package io.github.dmi3coder.javafx_design_patterns.behavioral.strategy;

/**
 * Created by dim3coder on 10/30/17.
 */
public class MultiplyStrategy implements Strategy {

  @Override
  public int doAction(int n1, int n2) {
    return n1 * n2;
  }

}
