package oi222ay_assign2.ex8;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Yahtzee extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage yahtzee) throws Exception {
		// TODO Auto-generated method stub
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setHgap(10);
		pane.setVgap(10);
		
		Text text = new Text("Yahtzee");
		text.setFont(Font.font("Serif",30));
		pane.add(text, 0, 0);
		
		Image dice1 = new Image("file:dice11.jpg");
		final ImageView d1 = new ImageView(dice1);
		d1.setFitHeight(50);
		d1.setFitWidth(50);
		
		Image dice2 = new Image("file:dice12.jpg");
		final ImageView d2 = new ImageView(dice2);
		d2.setFitHeight(50);
		d2.setFitWidth(50);
		
		Image dice3 = new Image("file:dice13.jpg");
		ImageView d3 = new ImageView(dice3);
		d3.setFitHeight(50);
		d3.setFitWidth(50);
		
		Image dice4 = new Image("file:dice14.jpg");
		ImageView d4 = new ImageView(dice4);
		d4.setFitHeight(50);
		d4.setFitWidth(50);
		
		Image dice5 = new Image("file:dice15.jpg");
		ImageView d5 = new ImageView(dice5);
		d5.setFitHeight(50);
		d5.setFitWidth(50);
		
		
		pane.add(d1, 0, 1);
		pane.add(d2, 1, 1);
		pane.add(d3, 2, 1);
		pane.add(d4, 3, 1);
		pane.add(d5, 4, 1);
		CheckBox cd1 = new CheckBox();
        pane.add(cd1, 0, 2);
        CheckBox cd2 = new CheckBox();
        pane.add(cd2, 1, 2);
        CheckBox cd3 = new CheckBox();
        pane.add(cd3, 2, 2);
        CheckBox cd4 = new CheckBox();
        pane.add(cd4, 3, 2);
        CheckBox cd5 = new CheckBox();
        pane.add(cd5, 4, 2);
        
        Button roll = new Button("Roll the Button!");
        roll.setOnAction(e ->{
        	Random rnd = new Random(4);
        	if(!cd1.isSelected()) {
        		if(rnd.equals(0)) {
        			final d1 = d2;
        		}
        		
        	}
        });
        pane.add(roll, 0, 3);
		
		Scene scene = new Scene(pane,500,200);
		yahtzee.setTitle("Yahtzee");
		yahtzee.setScene(scene);
		yahtzee.show();
		
	}

}
