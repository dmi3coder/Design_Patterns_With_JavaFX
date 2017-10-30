package io.github.dmi3coder.javafx_design_patterns.behavioral.template_method;

import java.util.Arrays;

/**
 * Created by dim3coder on 10/30/17.
 */
public class TemplateMethodExample {

  public static void main(String[] args) {
    new StringExport().export(Arrays.asList("item to export1", "item to export 2","bonus \n item"));
  }

}
