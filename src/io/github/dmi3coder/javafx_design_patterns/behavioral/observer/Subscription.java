package io.github.dmi3coder.javafx_design_patterns.behavioral.observer;

/**
 * Created by dim3coder on 10/30/17.
 */
interface Subscription<T> {

  void notify(T t);
}
