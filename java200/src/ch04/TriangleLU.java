package ch04;

import userType.userTypeInteger;

public class TriangleLU {
	public static void main(String[] args) {
		int n = userTypeInteger.in("왼쪽 위가 직각인 이등변 삼각형 표시\n단수: ");
		for (int i = 0; i < n; i++) {
			System.out.println("*".repeat(n-i));
		}
	}
}
