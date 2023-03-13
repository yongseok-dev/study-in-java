package ch07.sec12;

public class InstanceofExample {
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		ride(taxi);
		System.out.println();
		ride(bus);

	}

	private static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			((Bus) vehicle).checkFare();
		}

		if(vehicle instanceof Taxi) {
			((Taxi) vehicle).checkDest();
		}
		
		// java12 이상 아래 사용가능
//		if(vehicle instanceof Bus bus) {
//			bus.checkFare();
//		}
		vehicle.run();
	}
}
