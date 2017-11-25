import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class main extends Application {
	private CirclePane circlePane = new CirclePane();
	
	public void start(Stage primaryStage){
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button circleButton = new Button("Circle");
		Button squareButton = new Button("Square");
		CircleHandlerClass handler1 = new CircleHandlerClass();
		circleButton.setOnAction(handler1);
//		SquareHandlerClass handler2 = new SquareHandlerClass();
//		squareButton.setOnAction(handler2);
		hBox.getChildren().addAll(circleButton, squareButton);
		
	
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		Scene scene = new Scene(borderPane, 500, 450);
		primaryStage.setTitle("Java Paint");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}


class CircleHandlerClass implements EventHandler<ActionEvent>{

	

	@Override
	public void handle(ActionEvent ae) {
		// TODO Auto-generated method stub
		for(int x = 0; x < 10; x++){
		circlePane.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY){
				circlePane.show(e.getX(), e.getY());
			}
			else if (e.getButton() == MouseButton.SECONDARY){
				circlePane.shrink();
			}
		
	});
		}
	}
}
	
//class SquareHandlerClass implements EventHandler<ActionEvent> {
//
//		public void handle(ActionEvent e){
//			Square square = new Square();
//			circle.setCenterX(100);
//			circle.setCenterY(100);
//			circle.setRadius(50);
//			circle.setStroke(Color.BLACK);
//			circle.setFill(Color.RED);
//			
//	}	
//	
	
class CirclePane extends Pane {
	private Circle circle = new Circle(50);
	
	public CirclePane(){
	
	}
	public void show(double x, double y){		
		getChildren().add(circle);
		circle.setCenterX(x);
		circle.setCenterY(y);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
}
	public void enlarge(){
		
		circle.setRadius(circle.getRadius() + 2);
	}
	
	public void shrink(){
		circle.setRadius(circle.getRadius() > 2 ?
				circle.getRadius() - 2 : circle.getRadius());
	}
	

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
}
