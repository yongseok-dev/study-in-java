package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		//81~100 중에서 하나의 점수를 뽑아 학점 출력a+~b
		int score = (int) (Math.random()*20+81);
		String grade = "B";
		
//		if(score>=95) grade="A+";
//		else if(score>=90) grade="A";
//		else if(score>=85) grade="B+";
//		System.out.printf("%d점 %s입니다.",score,grade);
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
				System.out.printf("%d점 %s입니다.",score,grade);
			}else {
				grade="A";
				System.out.printf("%d점 %s입니다.",score,grade);
			}
		}else {
			if(score>=95) {
				grade="B+";
				System.out.printf("%d점 %s입니다.",score,grade);
			}else {
				grade="B";
				System.out.printf("%d점 %s입니다.",score,grade);
			}
		}
	}
}
