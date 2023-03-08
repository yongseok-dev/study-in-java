package ch04;

import java.util.Scanner;

public class PutAsterisk1 {

	public static void main(String[] args) {
		// 입력한 값의 개수만큼 *을 표시하는 프로그램
		Scanner sn = new Scanner(System.in);

		System.out.println("정수를 입력해주세요.");
		int number = sn.nextInt();
		if (number > 0) {

			// 1
			System.out.println("*".repeat(number));
			// 2
			while (number-- > 0) {
				System.out.print("*");
			}
		}

	}

}
