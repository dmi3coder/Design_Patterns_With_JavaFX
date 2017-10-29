package io.github.dmi3coder.javafx_design_patterns.behavioral.chain_of_responsibility;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by dim3coder on 10/29/17.
 */
public class UILogger extends AbstractLogger {

  ObservableList<String> observableLog;

  public UILogger(AbstractLogger nextLogger) {
    super(nextLogger);
    observableLog = FXCollections.observableArrayList();
    this.level = INFO;
  }

  public ObservableList<String> getObservableLog() {
    return observableLog;
  }

  @Override
  protected void write(String message) {
    observableLog.add(message);
  }
}
