package io.github.dmi3coder.javafx_design_patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dim3coder on 10/30/17.
 */
public class CareTaker {

  private List<Memento> mementos = new ArrayList<>();


  public void addMemento(Memento memento) {
    mementos.add(memento);
  }

  public Memento getMemento(int at) {
    return mementos.get(at);
  }

}
