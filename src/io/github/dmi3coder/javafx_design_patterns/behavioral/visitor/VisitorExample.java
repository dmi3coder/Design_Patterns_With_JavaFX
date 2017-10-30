package io.github.dmi3coder.javafx_design_patterns.behavioral.visitor;

/**
 * Created by dim3coder on 10/30/17.
 */
public class VisitorExample {

  public static void main(String[] args) {
    VisitableElement element = new VisitableElement();
    element.accept(new SoutVisitor());
  }

}
