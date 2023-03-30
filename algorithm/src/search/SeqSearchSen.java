package search;

import userType.UserType;

public class SeqSearchSen {
	static int seqSearchSen(int[] a, int n, int key) {
		int idx = 0;
		a[n] = key;
		while (true) {
			if (a[idx] == key) {
				return idx == n ? -1 : idx;
			}
			idx++;
		}
	}

	public static void main(String[] args) {
		int n = UserType.i("요소수");
		int[] arr = new int[n+1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		int key = UserType.i("찾고자 하는 수");

		System.out.println(seqSearchSen(arr, n, key));
	}
}
