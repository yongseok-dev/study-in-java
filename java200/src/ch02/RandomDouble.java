package ch02;

public class RandomDouble {

	public static void main(String[] args) {
		// 0.0이상 1.0미만 실수
		// 0.0이상 10.0미만 실수
		// -1.0이상 1.0미만 실수
		
		double a = Math.random();
		double b = Math.random()*10;
		double c = Math.random()*2-1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
