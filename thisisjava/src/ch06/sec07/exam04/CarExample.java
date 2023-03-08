package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car("아반때");
		Car car3 = new Car("소나타", "회색");
		Car car4 = new Car("그랜저", "검정", 250);

		Car[] carList = { car1, car2, car3, car4 };

		for (Car car : carList) {
			System.out.println("-----------------------");
			car.thisPrint();
			System.out.println("제조: " + car.company);
			System.out.println("모델: " + car.model);
			System.out.println("색상: " + car.color);
			System.out.println("최고속도: " + car.maxSpeed);
			System.out.println("속도: " + car.speed);
			System.out.println("-----------------------");
		}
	}

}
