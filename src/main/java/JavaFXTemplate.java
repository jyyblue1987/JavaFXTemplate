import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class JavaFXTemplate extends Application {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane parent = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));

		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome to JavaFX");

		textField2.setEditable(false);

		EventHandler<MouseEvent> eventHandler1 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {

				String content = textField1.getText() + ": from the center text field!";
				textField2.setText(content);
				button1.setDisable(true);
				button1.setText("pressed");
			}
		};
		button1.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler1);

		EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				textField1.setText("");
				textField2.setText("");
				textField2.setText("final string goes here");
				button1.setDisable(false);
				button1.setText("button1");
			}
		};
		button2.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler2);
		Scene scene = new Scene(parent, 800,505);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
