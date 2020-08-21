package oi222ay_assign3.ex8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TinyPainter extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage paint) throws Exception {
		// TODO Auto-generated method stub
		
		ColorPicker cp = new ColorPicker();
		
		ChoiceBox <String> shapes = new ChoiceBox<String>();
		shapes.getItems().addAll("Line", "Dot", "Rectangle", "Circle");
		
		ChoiceBox <String> size = new ChoiceBox<String>();
		size.getItems().addAll("1","5","10","15","20","25","30","35","40");
		
		HBox buttons = new HBox(10);
		buttons.getChildren().addAll(shapes,size,cp);
		buttons.setPadding(new Insets(10));
		
		Canvas canvas = new Canvas(1100,750);
		GraphicsContext gc;
        gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(1);
		
		Line line = new Line();
		Rectangle rect = new Rectangle();
		Rectangle dot = new Rectangle();
		Circle circ = new Circle();
		
		size.setOnAction(e->{
			if(size.getSelectionModel().getSelectedIndex() == 0) {
				gc.setLineWidth(1);
			}
			else if(size.getSelectionModel().getSelectedIndex() == 1) {
				gc.setLineWidth(5);
			}
			else if(size.getSelectionModel().getSelectedIndex() == 2) {
				gc.setLineWidth(10);
			}
			else if(size.getSelectionModel().getSelectedIndex() == 3) {
				gc.setLineWidth(15);
			}
			else if(size.getSelectionModel().getSelectedIndex() == 4) {
				gc.setLineWidth(20);
			}
			else if(size.getSelectionModel().getSelectedIndex() == 5) {
				gc.setLineWidth(25);
			}
			else if(size.getSelectionModel().getSelectedIndex() == 6) {
				gc.setLineWidth(30);
			}
			else if(size.getSelectionModel().getSelectedIndex() == 7) {
				gc.setLineWidth(35);
			}
			else  {
				gc.setLineWidth(40);
			}
		});
		
		
		canvas.setOnMouseClicked(e ->{
			if(shapes.getSelectionModel().getSelectedIndex() == 1) {
				gc.setStroke(cp.getValue());
				dot.setHeight(gc.getLineWidth());
				dot.setWidth(gc.getLineWidth());
				dot.setX(e.getX());                
                dot.setY(e.getY());
				
				if(dot.getX() > e.getX()) {
                    dot.setX(e.getX());
                }
                
                if(dot.getY() > e.getY()) {
                    dot.setY(e.getY());
                }
				
				gc.fillRect(dot.getX(), dot.getY(), dot.getWidth(), dot.getHeight());
                gc.strokeRect(dot.getX(), dot.getY(), dot.getWidth(), dot.getHeight());
			}
		});
		
		canvas.setOnMousePressed(e ->{
			if(shapes.getSelectionModel().getSelectedIndex() == 0) {
                gc.setStroke(cp.getValue());
                line.setStartX(e.getX());
                line.setStartY(e.getY());
			}
			else if(shapes.getSelectionModel().getSelectedIndex() == 2) {
                gc.setStroke(cp.getValue());
                gc.setFill(cp.getValue());
                rect.setX(e.getX());                
                rect.setY(e.getY());
            }
			else if(shapes.getSelectionModel().getSelectedIndex() == 3) {
                gc.setStroke(cp.getValue());
                gc.setFill(cp.getValue());
                circ.setCenterX(e.getX());
                circ.setCenterY(e.getY());
            }
			
		});
		
		canvas.setOnMouseReleased(e ->{
			if(shapes.getSelectionModel().getSelectedIndex() == 0) {
                line.setEndX(e.getX());
                line.setEndY(e.getY());
                gc.strokeLine(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY());
			}
			else if(shapes.getSelectionModel().getSelectedIndex() == 2) {
                rect.setWidth(Math.abs((e.getX() - rect.getX())));
                rect.setHeight(Math.abs((e.getY() - rect.getY())));
                
                if(rect.getX() > e.getX()) {
                    rect.setX(e.getX());
                }
                
                if(rect.getY() > e.getY()) {
                    rect.setY(e.getY());
                }

                gc.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
                gc.strokeRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
			}
			else if(shapes.getSelectionModel().getSelectedIndex() == 3) {
                circ.setRadius((Math.abs(e.getX() - circ.getCenterX()) + Math.abs(e.getY() - circ.getCenterY())) / 2);
                
                if(circ.getCenterX() > e.getX()) {
                    circ.setCenterX(e.getX());
                }
                if(circ.getCenterY() > e.getY()) {
                    circ.setCenterY(e.getY());
                }
                
                gc.fillOval(circ.getCenterX(), circ.getCenterY(), circ.getRadius(), circ.getRadius());
                gc.strokeOval(circ.getCenterX(), circ.getCenterY(), circ.getRadius(), circ.getRadius());     
            }
		});
		
		BorderPane bp = new BorderPane();
		bp.setTop(buttons);
		bp.setCenter(canvas);
		
		Scene scene = new Scene(bp, 1200, 800);
        paint.setTitle("Paint");
        paint.setScene(scene);
        paint.show();
	}

}
