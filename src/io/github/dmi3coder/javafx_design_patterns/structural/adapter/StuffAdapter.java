package io.github.dmi3coder.javafx_design_patterns.structural.adapter;

import javafx.scene.control.ListCell;
import javafx.util.Callback;

public class StuffAdapter implements ListAdapter {


  @Override
  public Callback getListFactory() {
    return (param) -> new ListCell<Stuff>(){

    };
  }
}
