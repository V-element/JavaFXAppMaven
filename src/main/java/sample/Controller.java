package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {

    public Label helloLabel;

    public void sayHello(ActionEvent actionEvent) {
        helloLabel.setText("Hello!!!");
    }
}
