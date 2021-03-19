import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class AppController {
    @FXML
    private VBox buttonbox = new VBox();

    @FXML
    private Button button1 = new Button();

    @FXML
    private Button button2 = new Button();

    @FXML
    private TextField textField1 = new TextField();

    @FXML
    private TextField textField2 = new TextField();

    public void initialize() {
        button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                String content = textField1.getText() + ": from the center text field!";
                textField2.setText(content);
                button1.setDisable(true);
                button1.setText("pressed");
            }
        } );

		button2.addEventHandler(MouseEvent.MOUSE_CLICKED,
				event ->  {
                textField1.setText("");
                textField2.setText("");
                textField2.setText("final string goes here");
                button1.setDisable(false);
                button1.setText("button 1");
		});
    }
}
