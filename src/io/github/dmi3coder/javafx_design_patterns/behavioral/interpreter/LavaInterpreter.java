package io.github.dmi3coder.javafx_design_patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dim3coder on 10/30/17.
 */
public class LavaInterpreter {

  private Map<String, String> variables;

  public LavaInterpreter() {
    variables = new HashMap<>();
  }

  public static void main(String[] args) {
    LavaInterpreter interpreter = new LavaInterpreter();
    interpreter.interpret("something = 10\n"
        + "anotherThing = code\n");
  }

  public void interpret(String code) {

    String[] lines = code.split("[\n]");
    for (int j = 0; j < lines.length; j++) {
      String[] variables = lines[j].split(" ");
      for (int i = 0; i < variables.length; i++) {
        if (variables[i].matches("^[a-zA-Z]+$")) {
          String variable = variables[i];
          if (variables[i + 1].equals("=")) {
            String value = variables[i + 2];
            this.variables.put(variable, value);
            i += 2;
          }
        }
      }
    }
    this.variables.entrySet().stream()
        .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
  }
}
