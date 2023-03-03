package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score=93;
		if(score>=90) {
			System.out.println("90이상");
			System.out.println("등급A");			
		}
		
		if(score<90) 
			System.out.println("90미만");
			System.out.println("등급B");						
		//if에서 실행문이 한줄일 때 중괄호 생략이 가능함.

	}

}
