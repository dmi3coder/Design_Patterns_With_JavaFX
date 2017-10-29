package io.github.dmi3coder.javafx_design_patterns.behavioral.chain_of_responsibility;

/**
 * Created by dim3coder on 10/29/17.
 */
public abstract class AbstractLogger {

  public static final int INFO = 1;
  public static final int DEBUG = 2;
  public static final int ERROR = 4;

  protected int level;

  protected AbstractLogger nextLogger;
  private AbstractLogger abstractLogger;

  public AbstractLogger(
      AbstractLogger nextLogger) {
    this.nextLogger = nextLogger;
  }

  public void setNextLogger(AbstractLogger abstractLogger) {
    this.abstractLogger = abstractLogger;
  }

  public void logMessage(int level, String message) {
    if (this.level <= level) {
      write(message);
    }
    if (nextLogger != null) {
      nextLogger.logMessage(level, message);
    }
  }

  abstract protected void write(String message);
}
