package ch07;

import java.util.Arrays;

import userType.UserType;

public class Med3 {
	static int med(int a, int b, int c) {
		int[] arr = { a, b, c };
		Arrays.sort(arr);
		return arr[1];
	}

	static int med2(int a, int b, int c) {
		int med = a;
		if ((b >= a && a >= c) || (c >= a && a >= b))
			med = a;
		if ((a >= b && b >= c) || (c >= b && b >= a))
			med = b;
		if ((a >= c && c >= b) || (b >= c && c >= a))
			med = c;
		return med;
	}

	public static void main(String[] args) {
		int a = UserType.i("정수 a: ");
		int b = UserType.i("정수 b: ");
		int c = UserType.i("정수 c: ");
		System.out.println(med(a, b, c));
		System.out.println(med2(a, b, c));
	}
}
