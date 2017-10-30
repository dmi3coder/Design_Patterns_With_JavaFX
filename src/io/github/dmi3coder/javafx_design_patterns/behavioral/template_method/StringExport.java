package io.github.dmi3coder.javafx_design_patterns.behavioral.template_method;

/**
 * Created by dim3coder on 10/30/17.
 */
public class StringExport extends ExportTemplate {

  @Override
  public void step2() {
    exportString += "StringExport:\n";
  }

  @Override
  public void step3() {
    data.forEach(item -> exportString += item+"\n");
  }
}
