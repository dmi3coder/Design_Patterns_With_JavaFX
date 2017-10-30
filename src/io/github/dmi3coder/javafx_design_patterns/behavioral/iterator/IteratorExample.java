package io.github.dmi3coder.javafx_design_patterns.behavioral.iterator;

/**
 * Created by dim3coder on 10/30/17.
 */
public class IteratorExample {

  public static void main(String[] args) {
    CustomArray array = CustomArray.getArray();
    Iterator<Integer> iterator = array.getIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}
