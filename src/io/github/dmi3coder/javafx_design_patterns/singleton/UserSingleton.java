package io.github.dmi3coder.javafx_design_patterns.singleton;

public final class UserSingleton {

  private static UserSingleton INSTANCE;
  private String username;
  private boolean authorized = false;

  private UserSingleton() {

  }

  public static UserSingleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new UserSingleton();
    }
    return INSTANCE;
  }

  public void setUser(String username) {
    this.username = username;
  }

  public String getUser() {
    return username;
  }

  public void setAuthorized(boolean authorized) {
    this.authorized = authorized;
  }

  public boolean isAuthorized() {
    return authorized;
  }
}
