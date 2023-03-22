package ch06;

import java.util.Arrays;

import userType.UserType;

public class CopyArrayReverse {
	public static void main(String[] args) {
		int n = UserType.i("요소수 : ", "+");
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = UserType.i("arr1[" + i + "] = ");
		}

		System.out.println("요소를 리버스 하였습니다.");
		for (int i = 0; i < arr1.length; i++) {
			arr2[n - i - 1] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
	}
}
