package io.github.dmi3coder.javafx_design_patterns.creational.protorype;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dim3coder on 10/13/17.
 */
public class CachedData {

  private static List<Author> data;

  public static List<String> getData() {
    if (data == null) {
      data = ReallyHardToLoadData.getAuthors();
    }
    return data.stream().map(author -> {
      try {
        return ((Author) author.clone());
      } catch (CloneNotSupportedException e) {
        e.printStackTrace();
      }
      return null;
    }).map(Author::getNickname).collect(Collectors.toList());
  }

}
