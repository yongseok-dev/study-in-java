package ch04;

import userType.userTypeInteger;

public class PutAsteriskFor {
	public static void main(String[] args) {
		int n = userTypeInteger.in("몇 개의 *를 표시할까요?");
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
