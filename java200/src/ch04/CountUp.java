package ch04;

import userType.userTypeInteger;

public class CountUp {
	public static void main(String[] args) {
		int n = userTypeInteger.in("카운트 업합니다.\n양의 정숫값:");
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
	}
}
