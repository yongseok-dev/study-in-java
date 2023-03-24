package ch07;

import userType.UserType;

public class SumUp1 {
	static int sumUp(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = UserType.i("1~n의 합계", "+");
		int sum = sumUp(n);
		System.out.println(sum);
	}
}
