package ch07;

import userType.UserType;

public class ArrayClone {
	public static void main(String[] args) {
		int n = UserType.i("요소수","+");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=UserType.i("a["+i+"]:");
		}
		int[]b = arrayClone(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println("b["+i+"]: "+b[i]);
		}
	}

	private static int[] arrayClone(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		return b;
	}
}
