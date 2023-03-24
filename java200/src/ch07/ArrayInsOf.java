package ch07;

import userType.UserType;

public class ArrayInsOf {
	static private int[] arrayInsOf(int[] a, int idx, int x) {
		int[] b = new int[a.length + 1];
		int n = 0;
		b[idx] = x;
		for (int i = 0; i < a.length; i++) {
			if (i < idx) {
				b[i] = a[i];
			} else {
				b[i + 1] = a[i];
			}
		}
		return b;
	}

	public static void main(String[] args) {
		int n = UserType.i("요소수", "+");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = UserType.i("a[" + i + "]:");
		}
		int x = -1;
		do {
			x = UserType.i("삽입할 인덱스: ");
		} while (x < 0 || x >= n);
		int s = 0;
			s = UserType.i("삽입할 값: ");
		int[] b = arrayInsOf(a, x, s);
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]" + b[i]);
		}
	}
}
