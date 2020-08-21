package oi222ay_assign1.ex3;

public interface Ferry  {
	   int countP();             					
	   int countVSpace();           					
	   int countMoney();                  					
	   Vehicle[] getAllVehicles();        					   
	   void embark(Vehicle v) throws Throwable;            
	   void embark(Passenger p) throws Throwable;          
	   void disembark();                  					
	   
	   boolean hasSpaceFor(Vehicle v);    					
	   boolean hasRoomFor(Passenger p);   					
	   String toString();                 					
}