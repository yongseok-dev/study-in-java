package ch02.sec01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour+"시간 "+minute+"분");
		
		int totalMinut = hour*60+minute;
		System.out.println("총: "+totalMinut+"분");
	}

}
