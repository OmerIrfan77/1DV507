package oi222ay_assign1.ex3;

public class FerryFunction implements Ferry{
	private Passenger [] passenger = new Passenger [0];
	private Vehicle [] vehicle = new Vehicle [0];
	private int total = 0;

	@Override
	public int countP() {
		// TODO Auto-generated method stub
		int passengers = 0;
		for (Vehicle vS : vehicle) {
            passengers += vS.getNoOfP();
        }
		return passenger.length + passengers;
	}

	@Override
	public int countVSpace() {
		// TODO Auto-generated method stub
		return vehicle.length;
	}

	@Override
	public int countMoney() {
		// TODO Auto-generated method stub
		int money = 0;
		
        for (Vehicle vS : vehicle) {
            money += vS.getPrice();
        }
        for (Passenger pS : passenger) {
            money += pS.getPrice();
        }

		return money;
	}

	@Override
	public Vehicle[] getAllVehicles() {
		// TODO Auto-generated method stub
		return this.vehicle;
	}

	@Override
	public void embark(Vehicle v){				
		// TODO Auto-generated method stub
		if(hasSpaceFor(v)) {
			Vehicle [] newV = new Vehicle [vehicle.length + 1];
			for(int i = 0; i < vehicle.length; i++) {
				newV[i] = this.vehicle[i];
			}
			newV[newV.length - 1] = v;
			this.vehicle = newV;
		}
		else {
			throw new StackOverflowError ("No space available!\n");
		}
	}

	@Override
	public void embark(Passenger p) {			
		// TODO Auto-generated method stub
		if(hasRoomFor(p)) {
			Passenger [] newPass = new Passenger [passenger.length + 1];
			for (int t = 0; t < passenger.length; t++) {
				newPass[t] = this.passenger[t];
			}
			newPass[newPass.length - 1] = p;
			this.passenger = newPass;
		}
		else {
			throw new StackOverflowError ("No space available!\n");
		}
	}

	@Override
	public void disembark() {						
		// TODO Auto-generated method stub
		this.vehicle = new Vehicle[0];
		this.passenger = new Passenger[0];
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {		
		// TODO Auto-generated method stub
		int space = 0;
		
		for(Vehicle vehSpace : vehicle) {
			if (vehSpace instanceof Bicycle) {
				space += (1/5);
			}
			else if (vehSpace instanceof Car) {
				space = space + 1;
			}
			else if (vehSpace instanceof Bus) {
				space = space + 4;
			}
			else if (vehSpace instanceof Lorry) {
				space = space + 8;
			}	
		}

		if (space < 40) {							
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean hasRoomFor(Passenger p) {
		// TODO Auto-generated method stub
		if(passenger.length < 200) {				
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		this.total += countMoney();
		return "\nFerry contains:" +"\n"+ "Vehicles: " + countVSpace() +
				"\n" + "Passengers: " + countP() + 
				"\n" + "Money Earned this trip: " + countMoney() +
				"\n" + "Total Money earned: " + total;
	}
}