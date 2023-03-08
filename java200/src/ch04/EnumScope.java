package ch04;

import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
		// 2개의 정수값 -> 작은 것 부터 큰것 까지 출력
		Scanner sn = new Scanner(System.in);

		System.out.println("두 정수를 입력해주세요.");
		int a = sn.nextInt();
		int b = sn.nextInt();
		if (a > b) {
			int t = a;
			a = b;
			b = a;
		}
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}

}
