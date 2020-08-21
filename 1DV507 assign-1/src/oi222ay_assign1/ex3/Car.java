package oi222ay_assign1.ex3;

public class Car extends Vehicle{
	private int price;
	
	public Car(int noOfP) {
		// TODO Auto-generated constructor stub
		super(noOfP);
		setPrice();
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice () {
		if(noOfP <= 4) {
		this.price = 100 + (20*noOfP);
		}
	}

	@Override
	protected int getNoOfP() {
		// TODO Auto-generated method stub
		return noOfP;
	}
}