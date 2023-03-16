package ch14.sec06.exam01;

public class SynchronizedExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User1Thread u1 = new User1Thread();
		u1.setCalculator(cal);
		u1.start();
		
		User2Thread u2 = new User2Thread();
		u2.setCalculator(cal);
		u2.start();
		
	}
}
