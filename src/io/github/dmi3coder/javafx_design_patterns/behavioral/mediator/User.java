package io.github.dmi3coder.javafx_design_patterns.behavioral.mediator;

/**
 * Created by dim3coder on 10/30/17.
 */
public class User {

  private String name;

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sendMessage(String message) {
    ChatRoom.sendMessage(this, message);
  }
}
