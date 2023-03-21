package ch04;

import userType.userTypeInteger;

public class SumForExp {
	public static void main(String[] args) {
		int n = userTypeInteger.in("1부터 n까지의 합을 구합니다. n의 값: ");
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i==n?(i+" = "+sum):(i+" + "));
		}
		System.out.println();
	}
}