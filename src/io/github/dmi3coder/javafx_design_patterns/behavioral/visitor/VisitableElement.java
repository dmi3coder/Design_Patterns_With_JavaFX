package io.github.dmi3coder.javafx_design_patterns.behavioral.visitor;

/**
 * Created by dim3coder on 10/30/17.
 */
public class VisitableElement implements Visitable {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override
  public String toString() {
    return "Some simple visitable element ;)";
  }
}
