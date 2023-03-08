package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		Car MyCar = new Car();

		System.out.println("제조: "+MyCar.company);
		System.out.println("모델: "+MyCar.model);
		System.out.println("색상: "+MyCar.color);
		System.out.println("최고속도: "+MyCar.maxSpeed);
		System.out.println("속도: "+MyCar.speed);

		MyCar.speed = 60;
		
		System.out.println("수정속도: "+MyCar.speed);
		
		
	}

}
