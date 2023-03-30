package search;

import userType.UserType;

public class SeqSearch {
	static int seqSearch(int[] a, int key) {
		int idx = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return idx;
	}

	public static void main(String[] args) {
		int n = UserType.i("요소수");
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		int key = UserType.i("찾고자 하는 수");

		System.out.println(seqSearch(arr, key));
	}
}
