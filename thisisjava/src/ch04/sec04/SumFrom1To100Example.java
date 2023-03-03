package ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		//1~100까지의 합을 구하시오
		int answer = 0;
		for(int i=1;i<=100;i++) {
			answer+=i;
		}
		System.out.print(answer);
	}

}
