package oi222ay_assign1.ex1;

public class Square extends Rectangle{
	private double side;

	public Square(String name, double side) {
		super(name, side, side);
		this.side = side;
		// TODO Auto-generated constructor stub
	}
	
	public double getSide() {
		return side;	
	}
	
	public void setSide(double side){
		this.side = side;
	}

}
