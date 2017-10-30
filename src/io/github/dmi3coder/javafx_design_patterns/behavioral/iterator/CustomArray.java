package io.github.dmi3coder.javafx_design_patterns.behavioral.iterator;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dim3coder on 10/30/17.
 */
public class CustomArray {

  ThreadLocalRandom random = ThreadLocalRandom.current();
  private Integer[] secretElements;

  private CustomArray() {
    secretElements = new Integer[8];
    for (int i = 0; i < secretElements.length; i++) {
      secretElements[i] = random.nextInt();
    }
  }

  public static CustomArray getArray() {
    return new CustomArray();
  }

  public Iterator<Integer> getIterator() {
    return new Iterator<Integer>() {
      private int currentElement = 0;

      @Override
      public boolean hasNext() {
        return currentElement < secretElements.length;
      }

      @Override
      public Integer next() {
        return secretElements[currentElement++];
      }
    };
  }
}
