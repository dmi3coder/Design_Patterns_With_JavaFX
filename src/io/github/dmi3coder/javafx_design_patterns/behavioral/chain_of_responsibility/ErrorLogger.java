package io.github.dmi3coder.javafx_design_patterns.behavioral.chain_of_responsibility;

/**
 * Created by dim3coder on 10/29/17.
 */
public class ErrorLogger extends AbstractLogger {

  public ErrorLogger(AbstractLogger nextLogger) {
    super(nextLogger);
    this.level = ERROR;
  }

  @Override
  protected void write(String message) {
    System.err.println("ErrorLogger: "+message);
  }
}
