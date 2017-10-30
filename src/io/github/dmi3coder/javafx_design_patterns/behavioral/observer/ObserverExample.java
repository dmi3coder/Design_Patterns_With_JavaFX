package io.github.dmi3coder.javafx_design_patterns.behavioral.observer;

/**
 * Created by dim3coder on 10/30/17.
 */
public class ObserverExample {

  public static void main(String[] args) {
    DataProducer.produceData(System.out::println);
  }

}
