package ch07;

import java.util.Iterator;

import userType.UserType;

public class Min {
	private static int min(int a, int b) {
		return a > b ? b : a;
	}

	private static int min(int a, int b, int c) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	private static int min(int[] a) {
		int min = a[0];
		for (int i : a) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int x = UserType.i("x값:");
		int y = UserType.i("y값:");
		int z = UserType.i("z값:");
		int n = UserType.i("배열 a의 요소 수:");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = UserType.i("a[" + i + "]: ");
		}
		System.out.println("x,y min> " + min(x, y));
		System.out.println("x,y,z min> " + min(x, y, z));
		System.out.println("a min> " + min(a));
	}
}
