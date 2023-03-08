package ch06.sec09;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("녹차");
		Car userCar = new Car("다함께 차차차");
		
		myCar.run();
		myCar.setSped(10);
		System.out.println(myCar.speed);
		userCar.run();
	}

}
