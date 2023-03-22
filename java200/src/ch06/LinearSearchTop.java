package ch06;

import userType.userTypeInteger;

//배열에서 특정 값을 가지는 요소를 찾아, 동일 값의 요소가 있다면 가장 앞선 값을 반환
public class LinearSearchTop {
	public static void main(String[] args) {
		int n = userTypeInteger.in("요소수: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = userTypeInteger.full("arr[" + i + "] = ");
		}
		int find = userTypeInteger.full("찾고자 하는 수: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				System.out.println("그 값은 a[" + i + "]에 있습니다.");
				break;
			} else if (i + 1 == n) {
				System.out.println("찾는 값이 없습니다.");
			}
		}
	}
}
