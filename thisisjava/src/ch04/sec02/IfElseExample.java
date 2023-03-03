package ch04.sec02;

public class IfElseExample {

	public static void main(String[] args) {
		int score=85;
		
		if(score>=90) {
			System.out.println("90이상");
			System.out.println("등급A");			
		}else {
			System.out.println("90미만");
			System.out.println("등급B");						
		}
		
		if(score>=60) {
			System.out.println("합격");						
		}else {
			System.out.println("불합격");									
		}
	}

}
