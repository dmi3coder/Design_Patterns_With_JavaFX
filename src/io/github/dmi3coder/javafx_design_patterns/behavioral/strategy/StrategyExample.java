package io.github.dmi3coder.javafx_design_patterns.behavioral.strategy;

/**
 * Created by dim3coder on 10/30/17.
 */
public class StrategyExample {

  public static void main(String[] args) {
    AddStrategy addStrategy = new AddStrategy();
    Context context = new Context(addStrategy);
    System.out.println(context.executeStrategy(20, 30));
    MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
    context = new Context(multiplyStrategy);
    System.out.println(context.executeStrategy(2, 3));


  }

}
