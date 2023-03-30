package search;

import java.util.Arrays;

import userType.UserType;

public class BinSearch {
	static int binSearch(int[] a, int key) {
		int pl = 0;
		int pr = a.length - 1;

		while (true) {
			int pc = (pl + pr) / 2;
			System.out.print("   | ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(i + "  ");
			}
			System.out.println();
			System.out.println("---+" + "---".repeat(a.length));
			System.out.println("   | " + "   ".repeat(pc) + "*");
			System.out.print("   | ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + (a[i] > 9 ? " " : "  "));
			}
			System.out.println();
			System.out.println();
			if (a[pc] == key) {
				return pc;
			} else if (a[pc] > key) {
				pr = pc - 1;
			} else {
				pl = pc + 1;
			}
			if (pl > pr) {
				return -1;
			}
		}

	}

	public static void main(String[] args) {
		int n = UserType.i("요소수");
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.println("arr[" + j + "] = " + arr[j]);
		}
		while (true) {
			int key = UserType.i("찾고자 하는 수");
			System.out.println(binSearch(arr, key));
		}
	}
}
