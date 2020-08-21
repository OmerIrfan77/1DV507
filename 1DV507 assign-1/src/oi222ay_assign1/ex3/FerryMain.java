package oi222ay_assign1.ex3;

public class FerryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FerryFunction ferry = new FerryFunction();						

		ferry.embark(new Bicycle(1));
		ferry.embark(new Car(3));
		ferry.embark(new Passenger());
		System.out.println(ferry.toString());
	}
}