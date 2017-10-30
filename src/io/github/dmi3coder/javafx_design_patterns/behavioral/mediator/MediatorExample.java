package io.github.dmi3coder.javafx_design_patterns.behavioral.mediator;

/**
 * Created by dim3coder on 10/30/17.
 */
public class MediatorExample {

  public static void main(String[] args) {
    User bob = new User("Bob");
    User alice = new User("Alice");
    bob.sendMessage("Hey Ivan");
    alice.sendMessage("Hello! This is most secured chat!");
    User eve = new User("Eve");
    eve.sendMessage("Yep, that's for sure");
  }

}
