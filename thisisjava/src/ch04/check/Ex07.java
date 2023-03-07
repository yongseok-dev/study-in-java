package ch04.check;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int account = 0;
		while (true) {
			System.out.println("--------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------");

			System.out.print("선택> ");
			String userType = scanner.nextLine();

			if ("1".equals(userType)) {
				System.out.print("예금액> ");
				String userTypeMoney = scanner.nextLine();
				account += Integer.parseInt(userTypeMoney);
			} else if ("2".equals(userType)) {
				System.out.print("출금액> ");
				String userTypeMoney = scanner.nextLine();
				account -= Integer.parseInt(userTypeMoney);
			} else if ("3".equals(userType)) {
				System.out.println("잔고> " + account);
			}
			if ("4".equals(userType))
				break;
		}
		System.out.println("프로그램 종료");
	}

}
