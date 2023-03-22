package ch04;

import userType.userTypeInteger;

public class Prime {
	public static void main(String[] args) {
		int n = 0;
		do {
			n = userTypeInteger.in("2이상 정숫값: ");
		} while (n < 2);
		String check = "소수입니다";
		for (int i = 3; i < n; i++) {
			if (n % i == 0) {
				check = "소수가 아닙니다";
				break;
			}
		}
		System.out.println(check);
	}

}
