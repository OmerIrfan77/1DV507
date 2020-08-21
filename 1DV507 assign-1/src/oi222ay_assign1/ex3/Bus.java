package oi222ay_assign1.ex3;

public class Bus extends Vehicle{
	private int price;

	public Bus(int noOfP) {
		// TODO Auto-generated constructor stub
		super(noOfP);
		setPrice();
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice () {
		if(noOfP <= 20) {
			this.price = 200 + (15*noOfP);
		}
	}

	@Override
	protected int getNoOfP() {
		// TODO Auto-generated method stub
		return noOfP;
	}
}