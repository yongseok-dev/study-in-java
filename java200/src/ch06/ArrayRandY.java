package ch06;

import java.util.Arrays;

import userType.UserType;

public class ArrayRandY {
	public static void main(String[] args) {
		int n;
		do {
			n = UserType.i("요소수:", "+");
		} while (n > 10);
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			int t = 0;
			while (t == 0) {
				t = (int) (Math.random() * 10 + 1);
				for (int j : arr) {
					if (j == t) {
						t = 0;
						break;
					}
				}
			}
			arr[i] = t;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
