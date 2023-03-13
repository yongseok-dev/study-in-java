package ch07.sec10.exam02;

public class CastingExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); //The method checkFare() is undefined for the type Vehicle
		
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
	}
}
