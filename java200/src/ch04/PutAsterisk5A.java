package ch04;

import userType.userTypeInteger;

public class PutAsterisk5A {
	public static void main(String[] args) {
		int n = userTypeInteger.in("몇 개의 *를 표시할까요? : ");
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
			if(i%5==0) {
				System.out.println();
			}
		}
	}
}
