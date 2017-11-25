import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloWorldMain extends Application {

	public static void main(String[] args){
		
		Application.launch(args);
		
	}
	
	public void start(Stage primaryStage){
		
		primaryStage.setTitle("Hello World");
		Group root = new Group();
		Scene scene = new Scene(root, 300, 250);
		
		
	}
	
}
