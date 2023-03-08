package ch06.sec10.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.printf("%d으로 달립니다.%n",speed);
	}
	
	static void simulate() {
		Car myCar = new Car();
		
		myCar.speed = 100;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car myCar = new Car();
		
		myCar.speed = 200;
		myCar.run();

		simulate();
	}
}
