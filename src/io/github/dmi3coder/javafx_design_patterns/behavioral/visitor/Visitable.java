package io.github.dmi3coder.javafx_design_patterns.behavioral.visitor;

/**
 * Created by dim3coder on 10/30/17.
 */
public interface Visitable {

  void accept(Visitor visitor);

}
