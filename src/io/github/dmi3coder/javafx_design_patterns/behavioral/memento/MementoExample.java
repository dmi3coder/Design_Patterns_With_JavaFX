package io.github.dmi3coder.javafx_design_patterns.behavioral.memento;

/**
 * Created by dim3coder on 10/30/17.
 */
public class MementoExample {

  public static void main(String[] args) {
    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator();
    originator.setState("State 1");
    originator.setState("State 2");
    careTaker.addMemento(originator.save());
    originator.setState("State 3");
    careTaker.addMemento(originator.save());
    originator.setState("State 4");
    originator.restore(careTaker.getMemento(0));
  }

}
