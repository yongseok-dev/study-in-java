package ch06.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {

//		Car MyCar = new Car(); // 생성불가...

		Car MyCar = new Car("그랜저","검정",250);

		System.out.println("제조: "+MyCar.company);
		System.out.println("모델: "+MyCar.model);
		System.out.println("색상: "+MyCar.color);
		System.out.println("최고속도: "+MyCar.maxSpeed);
		System.out.println("속도: "+MyCar.speed);
	}

}
