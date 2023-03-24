package ch07;

import userType.UserType;

public class AryExchng {
	static private void aryExchng(int[] a, int[] b) {
		int minSize = Math.min(a.length, b.length);
		for (int i = 0; i < minSize; i++) {
			int t = b[i];
			b[i] = a[i];
			a[i] = t;
		}
	}

	public static void main(String[] args) {
		int aSize = UserType.i("a의 요소수: ", "+");
		int[] a = new int[aSize];
		for (int i = 0; i < a.length; i++) {
			a[i] = UserType.i("a[" + i + "]: ");
		}
		int bSize = UserType.i("b의 요소수: ", "+");
		int[] b = new int[bSize];
		for (int i = 0; i < b.length; i++) {
			b[i] = UserType.i("b[" + i + "]: ");
		}
		aryExchng(a, b);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]: " + a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]: " + b[i]);
		}
	}
}
