package ch03;

import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		// 입력한 정수값이 5로 나누어떨어지면 "이 값은 5로 나누어집니다."
		// 나누어 떨어지지 않으면 "이 값은 5로 나누어지지 않습니다."
		// 음수 입력시 "음의 정수를 입력했습니다."
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 입력> ");
		int userType = stdIn.nextInt();
		if (userType < 0) {
			System.out.println("음의 정수를 입력했습니다.");
		} else {
			if (userType % 5 == 0) {
				System.out.println("이 값은 5로 나누어집니다.");
			} else {
				System.out.println("이 값은 5로 나누어지지 않습니다.");
			}
		}
	}

}
