package io.github.dmi3coder.javafx_design_patterns.creational.abstract_factory;

import javafx.scene.control.Button;

/**
 * Created by dim3coder on 10/11/17.
 */
public class LinuxButtonFactory implements AbstractButtonFactory {

  @Override
  public Button getOSButton(String name) {
    LinuxButton linuxButton = new LinuxButton(name);
    linuxButton.setAccessibleHelp("Linuxoid");
    return linuxButton;
  }

}
