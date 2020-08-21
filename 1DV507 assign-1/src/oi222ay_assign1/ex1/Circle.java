package oi222ay_assign1.ex1;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
		
	}
	
	public double getRadius () {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2* Math.PI * radius;
	}

}
