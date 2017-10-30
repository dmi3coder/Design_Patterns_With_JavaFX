package io.github.dmi3coder.javafx_design_patterns.behavioral.iterator;

/**
 * Created by dim3coder on 10/30/17.
 */
public interface Iterator<T> {
  boolean hasNext();
  T next();
}
