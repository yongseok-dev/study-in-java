package ch04;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		// 3자리의 양의 정숫값(100~999)을 읽는 프로그램을 작성(자리수가 맞지 않는다면, 다시 입력 받기)
		Scanner sn = new Scanner(System.in);

//		int userType = 0;
//		while (userType > 999 || 100 > userType) {
//			System.out.println("세자리 정수를 입력해 주세요.");
//			userType = sn.nextInt();
//		}
//		System.out.println("세자리 정수: " + userType);

		int x;
		do {
			System.out.println("세자리 정수를 입력해 주세요.");
			x = sn.nextInt();
		} while (x > 999 || 100 > x);
		System.out.println("세자리 정수: " + x);
	}
}
