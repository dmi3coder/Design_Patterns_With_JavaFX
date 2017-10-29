package io.github.dmi3coder.javafx_design_patterns.behavioral.chain_of_responsibility;

/**
 * Created by dim3coder on 10/29/17.
 */
public class ConsoleLogger extends AbstractLogger {

  public ConsoleLogger(AbstractLogger nextLogger) {
    super(nextLogger);
    this.level = DEBUG;
  }

  @Override
  protected void write(String message) {
    System.out.println("ConsoleLogger: " + message);
  }
}
