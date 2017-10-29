package io.github.dmi3coder.javafx_design_patterns.behavioral.command;

import java.util.List;

/**
 * Created by dim3coder on 10/29/17.
 */
public interface Command {

  void execute(List<User> users);

}
