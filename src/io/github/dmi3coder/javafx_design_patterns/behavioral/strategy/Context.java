package io.github.dmi3coder.javafx_design_patterns.behavioral.strategy;

/**
 * Created by dim3coder on 10/30/17.
 */
public class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }


  public int executeStrategy(int n1, int n2) {
    return strategy.doAction(n1, n2);
  }

  public Strategy getStrategy() {
    return strategy;
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }
}
