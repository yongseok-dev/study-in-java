package ch06;

import userType.UserType;

//인접 요소가 동일한 값을 가지지 않도록 수정
public class ArrayRandX {
	public static void main(String[] args) {
		int n = UserType.i("요소 수:", "+");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			do {
				arr[i] = (int) (Math.random() * 10 + 1);
			} while (i != 0 && arr[i - 1] == arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
