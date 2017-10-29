package io.github.dmi3coder.javafx_design_patterns.behavioral.command;

/**
 * Created by dim3coder on 10/29/17.
 */
public class User {

  public static final int GUEST = 0;
  public static final int MEMBER = 1;
  public static final int WAITER = 2;
  public static final int MANAGER = 3;
  public static final int DIRECTOR = 4;
  private String name;
  private UserLevel level = UserLevel.GUEST;

  public User(String name, int level) {
    this.name = name;
    this.level = UserLevel.values()[level];
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserLevel getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = UserLevel.values()[level];
  }

  public static enum UserLevel {
    GUEST,
    MEMBER,
    WAITER,
    MANAGER,
    DIRECTOR
  }
}
