package ch03.sec11;

public class ConditionalOprationExample {

	public static void main(String[] args) {
		// 삼항연산자
		int score = 85;
		char grade = (score>90)?'A':(score>80)?'B':'C';
		System.out.printf("%d점은 %c등급입니다.",score,grade);

	}

}
