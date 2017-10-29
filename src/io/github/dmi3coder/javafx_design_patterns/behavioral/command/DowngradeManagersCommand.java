package io.github.dmi3coder.javafx_design_patterns.behavioral.command;

import io.github.dmi3coder.javafx_design_patterns.behavioral.command.User.UserLevel;
import java.util.List;

/**
 * Created by dim3coder on 10/29/17.
 */
public class DowngradeManagersCommand implements Command {

  @Override
  public void execute(List<User> users) {
    users.stream().filter(user -> user.getLevel() == UserLevel.MANAGER)
        .forEach(user -> user.setLevel(User.WAITER));
  }
}
