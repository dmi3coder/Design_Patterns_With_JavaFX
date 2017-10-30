package io.github.dmi3coder.javafx_design_patterns.behavioral.memento;

/**
 * Created by dim3coder on 10/30/17.
 */
public class Originator {

  private String state;


  public void setState(String state) {
    System.out.println("Originator: new state: " + state);
    this.state = state;
  }

  public Memento save() {
    return new Memento(state);
  }

  public void restore(Memento memento) {
    state = memento.getState();
    System.out.println("Originator: new state: " + state);
  }

}
