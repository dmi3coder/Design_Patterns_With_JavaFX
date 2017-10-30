package io.github.dmi3coder.javafx_design_patterns.behavioral.template_method;

import java.util.List;

/**
 * Created by dim3coder on 10/30/17.
 */
public abstract class ExportTemplate {

  protected String exportString;
  protected List<String> data;

  public void export(List<String> data) {
    this.data = data;
    step1();
    step2();
    step3();
    step4();
  }

  public void step1() {
    System.out.println("Preparing export");
    exportString = "export:\n";
  }

  public abstract void step2();

  public abstract void step3();

  public void step4() {
    System.out.println(exportString);
  }

}
