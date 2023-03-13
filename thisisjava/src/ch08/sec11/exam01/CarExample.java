package ch08.sec11.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println();
		
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		myCar.run();
	}
}
