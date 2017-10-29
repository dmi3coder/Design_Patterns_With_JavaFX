package io.github.dmi3coder.javafx_design_patterns.structural.proxy;

import java.util.Map;
import javafx.scene.image.Image;

/**
 * Created by dim3coder on 10/29/17.
 */
public class ProxyImage implements Imageable {

  private Imageable imageable;

  public ProxyImage(Imageable imageable) {
    this.imageable = imageable;
  }

  @Override
  public Image getPrivateImage() throws IllegalAccessException {
    Map<String, String> getenv = System.getenv();
    String unlocked = System.getenv("UNLOCKED");
    boolean aBoolean = Boolean.parseBoolean(unlocked);
    if (aBoolean) {
      return imageable.getPrivateImage();
    }
    throw new IllegalAccessException("You don't have UNLOCKED environment flag");
  }
}
