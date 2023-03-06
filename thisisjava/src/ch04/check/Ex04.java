package ch04.check;

public class Ex04 {

	public static void main(String[] args) {

		while (true) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			System.out.printf("(%d,%d)\n",num1,num2);
			if (num1 + num2 == 5)
				break;
		}
		System.out.printf("두 눈의 합이 5가 나와 프로그램을 종료합니다.");

	}

}
