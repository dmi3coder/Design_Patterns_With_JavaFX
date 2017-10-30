package io.github.dmi3coder.javafx_design_patterns.behavioral.observer;

/**
 * Created by dim3coder on 10/30/17.
 */
public class DataProducer {

  public static void produceData(Subscription<String> subscription) {
    new Thread(() -> {
      try {
        Thread.sleep(1000);
        subscription.notify("First batch");
        Thread.sleep(1000);
        subscription.notify("Second batch");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();
  }

}
