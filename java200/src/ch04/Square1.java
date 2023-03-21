package ch04;

import userType.userTypeInteger;

//1부터 n까지 정숫값에 각 값을 제곱해서 표시
public class Square1 {
	public static void main(String[] args) {
		int n = userTypeInteger.in("정숫값: ");
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d의 제곱은 %d입니다.%n", i, i * i);
		}
	}
}
