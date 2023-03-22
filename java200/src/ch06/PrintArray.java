package ch06;

import userType.userTypeInteger;

//배열의 요소 수와 개별 요소의 값을 입력 받아서 표시하는 프로그램
public class PrintArray {
	public static void main(String[] args) {
		int n = userTypeInteger.in("요소수: ");
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = userTypeInteger.full("a[" + i + "] = ");
		}

		System.out.print("a = {");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i != n - 1 ? ", " : "}"));
		}

	}
}
