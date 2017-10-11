package io.github.dmi3coder.javafx_design_patterns.abstract_factory;

import javafx.scene.control.Button;

/**
 * Created by dim3coder on 10/11/17.
 */
public interface AbstractButtonFactory {

  Button getOSButton(String name);
}
