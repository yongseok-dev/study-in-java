package ch07;

import userType.UserType;

public class ArrayRemoveOfN {
	static private int[] arrayRmvOfN(int[] a, int idx, int size) {
		int[] result = new int[a.length - size];
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if (!(i >= idx && i < size + idx)) {
				result[n++] = a[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n = UserType.i("요소수", "+");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = UserType.i("a[" + i + "]:");
		}
		int x = -1;
		do {
			x = UserType.i("삭제할 인덱스: ");
		} while (x < 0 || x >= n);
		int s = 0;
		do {
			s = UserType.i("삭제할 요소의 개수: ");
		} while (x+s > n);
		int[] b = arrayRmvOfN(a, x, s);
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]" + b[i]);
		}
	}
}
