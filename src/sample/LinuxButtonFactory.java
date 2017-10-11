package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;

/**
 * Created by dim3coder on 10/11/17.
 */
public class LinuxButtonFactory implements AbstractButtonFactory {

  @Override
  public Button getOSButton(String name) {
    LinuxButton linuxButton = new LinuxButton(name);
    linuxButton.setAccessibleHelp("Linuxoid");
    return linuxButton;
  }

}
