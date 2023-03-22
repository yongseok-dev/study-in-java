package ch04;

import userType.userTypeInteger;

//n단의 숫자 피라미드를 표시하는 프로그램 i번 째 행에는 i%10을 표시
public class DigitPyramid {
	public static void main(String[] args) {
		int n = userTypeInteger.in("단수: ");
		for (int i = 1; i <= n; i++) {
				System.out.print(" ".repeat(n-i)+String.valueOf(i%10).repeat(i*2-1));
			System.out.println();
		}
	}
}
