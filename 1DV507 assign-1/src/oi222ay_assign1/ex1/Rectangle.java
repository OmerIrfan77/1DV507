package oi222ay_assign1.ex1;

public class Rectangle extends Shape{
	private double base;
	private double height;
	
	public Rectangle (String name, double base, double height) {
		super(name);
		this.base = base;
		this.height = height;
	}
	
	public double getBase () {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getHeight () {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return base * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2* (base + height);
	}

}
