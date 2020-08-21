package oi222ay_assign1.ex1;

import java.util.ArrayList;

public class ShapeMain {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add( new Rectangle("R1",2,3) ); 
		shapes.add( new Rectangle("R2",3,4) ); 
		shapes.add( new Square("S1",3) );
		shapes.add( new Square("S2",5) );
		shapes.add( new Circle("C1",1) ); 
		shapes.add( new Circle("C2",2) );
		
		for (Shape s :shapes) 
			System.out.println(s);
	}
}
