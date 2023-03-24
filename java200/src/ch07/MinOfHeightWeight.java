package ch07;

import userType.UserType;

public class MinOfHeightWeight {
	private static int minOf(int[] arr) {
		int min = arr[0];
		for (int i : arr) {
			if(min>i)min=i;
		}
		return min;
	}
	public static void main(String[] args) {
		int n = UserType.i("사람수: ","+");
		int[] h = new int[n];
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			h[i]=UserType.i((i+1)+"번의 신장: ","+");
			w[i]=UserType.i((i+1)+"번의 체중: ","+");
		}
		System.out.println("가장 키가 작은 사람의 신장: "+minOf(h)+"cm");
		System.out.println("가장 마른 사람의 체중: "+minOf(w)+"kg");
	}
}
