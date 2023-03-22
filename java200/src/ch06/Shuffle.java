package ch06;

import java.util.Iterator;

import userType.UserType;

public class Shuffle {
	public static void main(String[] args) {
		int n = UserType.i("요소수 : ", "+");
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = UserType.i("arr[" + i + "] = ");
		}

		System.out.println("요소를 섞었습니다.");
		for (int i = 0; i < arr.length; i++) {
			int ran = (int) (Math.random() * arr.length);
			int t = arr[i];
			arr[i] = arr[ran];
			arr[ran] = t;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
