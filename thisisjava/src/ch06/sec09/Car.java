package ch06.sec09;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSped(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSped(100);
		System.out.printf("%s가 달립니다. (시속: %d km/h)%n",this.model,this.speed);
	}
}
