package ch06.sec07.exam05;

public class Car {
	String company = "현대차";
	String model;
	String color;
	int maxSpeed;
	int speed;

	Car() {
	}

	public Car(String model) {
		this(model, "은색", 250); // 다른 생성자 호출
	}

	Car(String model, String color) {
		this(model, color, 250); // 다른 생성자 호출
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}


//	public void testConstructor() {
//		this(model, "은색", 250);
//	}
	
	public void thisPrint() {
		System.out.println(this);
	}

}
