import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFXTemplate extends Application {


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

		Scene scene = new Scene(parent, 800,505);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
