package oi222ay_assign1.ex3;

public abstract class Vehicle {
	protected int noOfP;
	
	public Vehicle (int noOfPInV) {
		noOfP = noOfPInV;
	}
	
	protected abstract int getNoOfP();

	protected abstract int getPrice();
}