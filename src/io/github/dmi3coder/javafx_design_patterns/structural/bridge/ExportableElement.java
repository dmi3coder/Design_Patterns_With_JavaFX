package io.github.dmi3coder.javafx_design_patterns.structural.bridge;

import java.util.List;

/**
 * Created by dim3coder on 10/23/17.
 */
public abstract class ExportableElement {

  protected ExportType exportType;

  public ExportableElement(
      ExportType exportType) {
    this.exportType = exportType;
  }

  public String export(){
    return exportType.exportData(this);
  }

  public abstract List<String> getKeys();

  public abstract List<String> getValues();
}
