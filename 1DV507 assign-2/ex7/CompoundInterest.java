package oi222ay_assign2.ex7;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CompoundInterest extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage compoundInt) throws Exception {
		// TODO Auto-generated method stub
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		Text text = new Text("Compound Interest");
		text.setFont(Font.font("Serif",30));
		
		pane.add(text, 0, 0);
		
		pane.add(new Label("Start Amount:"), 0, 1);
		final TextField startAmount = new TextField();
		pane.add(startAmount, 1, 1);
		
		pane.add(new Label("Interest:"), 0, 2);
		final TextField interest = new TextField();
		pane.add(interest, 1, 2);
		
		pane.add(new Label("Number of years:"), 0, 3);
		final TextField noOfY = new TextField();
		pane.add(noOfY, 1, 3);
		
		final Label result = new Label();
		pane.add(result, 0, 4);
		
		Button calc = new Button("Calculate");
		pane.add(calc, 1, 4);
		GridPane.setHalignment(calc, HPos.RIGHT);
		
		calc.setOnAction(e->{
			double sA = Double.parseDouble(startAmount.getText());
			double i = Double.parseDouble(interest.getText());
			double y = Double.parseDouble(noOfY.getText());
			double compInt = sA*Math.pow((1+ i/100), y);
			int rounded = (int) Math.round(compInt);
			result.setText("In total that will be " + rounded);
		});
		
		Scene scene = new Scene(pane,500,200);
		compoundInt.setTitle("Compound Interest");
		compoundInt.setScene(scene);
		compoundInt.show();
		
		
	}

}
