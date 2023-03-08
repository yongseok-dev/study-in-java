package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(50);
		System.out.println("속도: "+myCar.getSpeed());
		
		myCar.setSpeed(-50);
		System.out.println("속도: "+myCar.getSpeed());
		
		myCar.setSpeed(0);
		System.out.println("속도: "+myCar.getSpeed());

		myCar.setSpeed(10);
		System.out.println("속도: "+myCar.getSpeed());

		System.out.println("isStop: "+myCar.isStop());
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("속도: "+myCar.getSpeed());
		
	}

}
