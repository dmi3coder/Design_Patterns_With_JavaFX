package io.github.dmi3coder.javafx_design_patterns.behavioral.mediator;

import java.util.Date;

/**
 * Created by dim3coder on 10/30/17.
 */
public class ChatRoom {

  public static void sendMessage(User user, String message) {
    System.out
        .println(String.format("%s at %s: %s", user.getName(), new Date().toString(), message));
  }

}
