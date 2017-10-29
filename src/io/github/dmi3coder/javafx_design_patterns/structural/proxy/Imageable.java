package io.github.dmi3coder.javafx_design_patterns.structural.proxy;

import javafx.scene.image.Image;

/**
 * Created by dim3coder on 10/29/17.
 */
public interface Imageable {

  Image getPrivateImage() throws IllegalAccessException;

}
