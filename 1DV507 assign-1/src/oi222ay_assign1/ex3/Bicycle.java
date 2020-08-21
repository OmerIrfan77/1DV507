package oi222ay_assign1.ex3;

public class Bicycle extends Vehicle{
	private int price;
	
	public Bicycle(int noOfP) {
		// TODO Auto-generated constructor stub
		super(noOfP);
		setPrice();
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice () {
		this.price = 40;
	}

	@Override
	protected int getNoOfP() {
		// TODO Auto-generated method stub
		return noOfP;
	}
}