package ch04.sec02;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score=85;
		
		if(score>=90) {
			System.out.println("100~90");
			System.out.println("등급A");			
		}else if(score>=80) {
			System.out.println("80~89");
			System.out.println("등급B");			
		}else if(score>=70) {
			System.out.println("79~70");
			System.out.println("등급C");			
		}else {
			System.out.println("70미만");
			System.out.println("등급D");			
		}
	}

}
