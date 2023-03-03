package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// 구구단 출력
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
			System.out.println("--------");
		}
	}
}
