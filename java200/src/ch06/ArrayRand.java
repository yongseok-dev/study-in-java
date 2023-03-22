package ch06;

import userType.UserType;

public class ArrayRand {
	public static void main(String[] args) {
		int n = UserType.i("요소 수:", "+");
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}