package ch06;

import userType.userTypeInteger;

//int 배열 1~10 난수를 입력하고 각 요소의 값과 막대 그래프를 작성하라
public class ColumnChart {
	public static void main(String[] args) {
		int n = userTypeInteger.in("요소 수:");
		String[] arr = new String[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "";
		}
		for (int i = 0; i < n; i++) {
			int randomNumber = (int) (Math.random() * 10);
			for (int j = 0; j < arr.length; j++) {
				arr[j] += (j < randomNumber ? "  " : "* ");
			}
		}
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println("--".repeat(n));
		for (int i = 0; i < n; i++) {
			System.out.print(i%10+" ");
		}
	}
}
