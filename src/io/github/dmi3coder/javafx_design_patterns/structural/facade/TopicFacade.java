package io.github.dmi3coder.javafx_design_patterns.structural.facade;

import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class TopicFacade {

  private Label label;
  private ListView<String> listView;


  public TopicFacade(Label label, ListView<String> listView) {
    this.label = label;
    this.listView = listView;
  }

  public void setTopic(String topic) {
    if (topic.equals("cars")) {
      label.setText("Cars");
      listView.setItems(FXCollections.observableList(Arrays.asList("Mitsubishi", "Toyota", "Another car", "and Another")));
    } else if (topic.equals("guns")) {
      label.setText("Guns");
      listView.setItems(FXCollections.observableArrayList("AK-47","M-16","P-32","G-64","D-128"));
    }
  }
}
