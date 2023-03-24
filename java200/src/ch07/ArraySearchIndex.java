package ch07;

import userType.UserType;

//배열 a의 요소 중 값이 x인 모든 요소의 인덱스를 저장해 반환하는 함수
public class ArraySearchIndex {
	private static int[] arraySrchIdx(int[] a, int x) {
		int n = 0;
		for (int i : a) {
			if (i == x) {
				n++;
			}
		}
		int[] b = new int[n];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
//				System.out.println(i);
				b[b.length - (n--)] = i;
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
		int x = UserType.i("탐색할 값");
		int[] b = arraySrchIdx(a, x);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
