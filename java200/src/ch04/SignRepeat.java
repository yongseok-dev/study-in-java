package ch04;

import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		// 정숫값의 부호를 판정해서 표시하는 Sign 프로그램인 [문제 3-5]를 원하는 만큼 반복해서 입력 및 표시하도록 수정하자.
		boolean isRun = true;
		Scanner stdIn = new Scanner(System.in);
		while (isRun) {

			System.out.print("정수값> ");
			int userType = stdIn.nextInt();

			System.out.println(userType > 0 ? "+" : userType < 0 ? "-" : "0");
			
			System.out.print("1. 계속진행 2. 종료> ");
			userType = stdIn.nextInt();
			if(userType==2) {
				isRun = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
