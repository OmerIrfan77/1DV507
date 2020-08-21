package oi222ay_assign1.ex3;

public class Lorry extends Vehicle{
	private int price;
	
	public Lorry(int noOfP) {
		// TODO Auto-generated constructor stub
		super(noOfP);
		setPrice();
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice () {
		if(noOfP <= 2) {
		this.price = 300 + (20*noOfP);
		}
	}

	@Override
	protected int getNoOfP() {
		// TODO Auto-generated method stub
		return noOfP;
	}
}