package ch04;

import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		// 입력받은 정숫값부터 0까지 카운트다운
		Scanner sn = new Scanner(System.in);

		System.out.println("정수를 입력해주세요.");
		int number = sn.nextInt();

		do {
			System.out.println(number);
			number--;
		} while (number >= 0);
		System.out.println("프로그램 종료 시점: "+number);
	}

}
