package io.github.dmi3coder.javafx_design_patterns.structural.adapter;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;

public class StuffCell extends ListCell<Stuff> {

  @FXML
  ImageView image;
  @FXML
  Label name;
  @FXML
  Label position;
  @FXML
  Label phone;
  @FXML
  Button fire_button;


  @Override
  protected void updateItem(Stuff item, boolean empty) {
    super.updateItem(item, empty);
    setText(null);
    setGraphic(null);
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("stuff_item.fxml"));
      loader.setController(this);
      Node root = loader.load();
      setGraphic(root);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
