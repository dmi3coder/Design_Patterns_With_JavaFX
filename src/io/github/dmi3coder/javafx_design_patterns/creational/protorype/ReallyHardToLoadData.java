package io.github.dmi3coder.javafx_design_patterns.creational.protorype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dim3coder on 10/13/17.
 */
public class ReallyHardToLoadData {


  public static List<Author> getAuthors() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    List<Author> authors = Arrays.asList(
        new Author("", "Dmitriy", "dmi3coder"),
        new Author("", "Another Dmitriy", "notdmi3coder"),
        new Author(null, "", "andrew_someone"),
        new Author(null, "", "creator_of_framework224"),
        new Author(null, "", "superHacker218"),
        new Author(null, "", "xXxUserusxXx"),
        new Author(null, "", "someone_new"),
        new Author(null, "", "someone_old")
    );
    Collections.shuffle(authors);
    return authors;
  }

}
