package ch02;

public class RandomInteger {

	public static void main(String[] args) {
		// 다음과 같은 프로그램 작성
		/**
		 * 랜덤한
		 * 1. 한 자리 양의 정수(1~9)
		 * 2. 한 자리 음의 정수(-9~-1)
		 * 3. 두 자리 양의 정수(10~99)
		 * 를 출력
		 */
		
		int a = (int)(Math.random()*9+1);
		int b = (int)(Math.random()*(-9)-1);
		int c = (int)(Math.random()*(90)+10);
		
		System.out.printf("1. %d%n2. %d%n3. %d",a,b,c);
	}

}
