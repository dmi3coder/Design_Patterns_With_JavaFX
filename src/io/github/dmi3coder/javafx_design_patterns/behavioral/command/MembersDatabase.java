package io.github.dmi3coder.javafx_design_patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dim3coder on 10/29/17.
 */
public class MembersDatabase {

  private List<User> allMembers;

  public MembersDatabase() {
    this.allMembers = new ArrayList<>();
  }

  public void addNewMember(String name) {
    allMembers.add(new User(name, User.GUEST));
  }

  public void addNewMember(String name, int level) {
    allMembers.add(new User(name, level));
  }

  public void displayCurrentStatus() {
    System.out
        .println(
            allMembers.stream().map(user -> "(" + user.getName() + ":" + user.getLevel() + ")")
                .collect(
                    Collectors.joining(",")));
  }

  public void executeCommand(Command command) {
    command.execute(allMembers);
  }
}
