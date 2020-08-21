package oi222ay_assign2.ex6;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Snowman extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage snowman) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		
		Circle head = new Circle(450,300,20);
		head.setStroke(Color.WHITE);
		head.setFill(Color.WHITE);
		
		Circle eye1 = new Circle(455,300,2);
		eye1.setStroke(Color.RED);
		eye1.setFill(Color.RED);
		
		Circle eye2 = new Circle(440,300,2);
		eye2.setStroke(Color.RED);
		eye2.setFill(Color.RED);
		
		Circle body1 = new Circle(450,355,40);
		body1.setStroke(Color.WHITE);
		body1.setFill(Color.WHITE);
		
		Circle button1 = new Circle(450,355,5);
		button1.setStroke(Color.BLACK);
		button1.setFill(Color.BLACK);
		
		Circle button2 = new Circle(450,340,5);
		button2.setStroke(Color.BLACK);
		button2.setFill(Color.BLACK);
		
		Circle button3 = new Circle(450,370,5);
		button3.setStroke(Color.BLACK);
		button3.setFill(Color.BLACK);
		
		Circle body2 = new Circle(450,445,60);
		body2.setStroke(Color.WHITE);
		body2.setFill(Color.WHITE);
		
		Circle sun = new Circle (700,100,80);
		sun.setStroke(Color.ORANGERED);
		sun.setFill(Color.YELLOW);
		
		Rectangle ground = new Rectangle(0,500,900,200);
		ground.setFill(Color.WHITE);
		
		root.getChildren().addAll(head,body1,body2,sun,ground,button1,button2,button3,eye1,eye2);
		
		Scene scene = new Scene (root,900,700);
		scene.setFill(Color.DEEPSKYBLUE);
		snowman.setTitle("Snowman");
		snowman.setScene(scene);
		snowman.show();
		
	}

}
