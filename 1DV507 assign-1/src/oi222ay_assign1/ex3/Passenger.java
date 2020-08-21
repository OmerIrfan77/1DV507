package oi222ay_assign1.ex3;

public class Passenger {
	private int price = 0;
	
	public Passenger() {

	}
	
	public Passenger(int price) {
		if (price == 25) {
			this.price += 25;
		}
	}
	
	public int getPrice() {
		return price;
	}
}