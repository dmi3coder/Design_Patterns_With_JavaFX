package io.github.dmi3coder.javafx_design_patterns.structural.proxy;

import javafx.scene.image.Image;

/**
 * Created by dim3coder on 10/29/17.
 */
public class SensitiveImage implements Imageable {

  @Override
  public Image getPrivateImage() throws IllegalAccessException {
    return new Image("https://viceland-assets-cdn.vice.com/viceblog/60373103markzuckerbergohartis.jpg");
  }
}
