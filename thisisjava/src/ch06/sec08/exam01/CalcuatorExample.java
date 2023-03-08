package ch06.sec08.exam01;

public class CalcuatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("myCalc.plus(5, 6):"+result1);
		System.out.println(result1==myCalc.plus(6, 5));

		int x = 10;
		int y = 3;
		
		System.out.println("x, y: "+x+", "+y);
		System.out.println("myCalc.divide(x, y):"+myCalc.divide(x, y));

		myCalc.powerOff();
	}

}
