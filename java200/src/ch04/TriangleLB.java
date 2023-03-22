package ch04;

import userType.userTypeInteger;

public class TriangleLB {
	public static void main(String[] args) {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		int n = userTypeInteger.in("단수는?");
		for (int i = 0; i < n; i++) {
			System.out.println("*".repeat(i + 1));
		}
	}
}
