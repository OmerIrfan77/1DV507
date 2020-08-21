package oi222ay_assign3.ex9;

import java.io.File;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * 
 * @author Omer Irfan
 * Inspiration from : https://stackoverflow.com/questions/42475502/animating-a-sprite-with-javafx-on-key-input
 * 
 *
 */

public class RunningSprite extends Application{
	public int image = 0;
	public int speed = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage runner) throws Exception {
		// TODO Auto-generated method stub
		
		Image background = new Image(new File("images/backgroundsprite.png").toURI().toString());
		ImageView bc = new ImageView(background);
		bc.setFitHeight(500);
		bc.setFitWidth(1000);
		
		Image [] character = new Image [6];
		character [0] = new Image(new File("images/pein run 1.png").toURI().toString());
		character [1] = new Image(new File("images/pein run 2.png").toURI().toString());
		character [2] = new Image(new File("images/pein run 3.png").toURI().toString());
		character [3] = new Image(new File("images/pein run 4.png").toURI().toString());
		character [4] = new Image(new File("images/pein run 5.png").toURI().toString());
		character [5] = new Image(new File("images/pein run 6.png").toURI().toString());
		
		Image ch = new Image(new File("images/pein standing.png").toURI().toString());
		ImageView hero = new ImageView(ch);
		hero.setFitHeight(150);
		hero.setFitWidth(200);
		hero.setX(300);
		hero.setY(255);
		
		Group root = new Group();
		root.getChildren().addAll(bc, hero);
		
		Scene scene = new Scene(root,1000,500);
		runner.setTitle("Running Sprite");
		runner.setScene(scene);
		runner.show();
		
		KeyFrame kf = new KeyFrame(Duration.millis(80), e -> {
			if (image == 6) {
				image = 0;
			}
			hero.setImage(character[image++]);
			hero.setX(hero.getX() + speed);
			if(hero.getX() <= 0 || hero.getX() >= 1000 - 200){
				speed = -speed;
			}
			
			if (speed < 0) {
				hero.setScaleX(-1);
			}
			else {
				hero.setScaleX(1);
			}
			
		});
		
		Timeline t = new Timeline(kf);
		t.setCycleCount(Timeline.INDEFINITE);
		t.play();
		
	}

}
