package ch04;

import java.util.Arrays;

import userType.userTypeInteger;

//5개의 정수로 구성된 그룹의 전체 합계(그룹 별이 아닌 전체 그룹의 합)를 구하는 프로그램 작성.
//10개 그룹, 정숫값을 키보드를 통해 입력,  99999 입력 시 전체 입력 종료, 88888 입력시 그룹 입력 종료
public class SumGroup2 {
	public static void main(String[] args) {
		System.out.println("정수를 더합니다.");
		int count = 10;
		int endAll = 99999;
		int endGroup = 88888;

		int[] sum = new int[count];

		for (int i = 1; i <= sum.length; i++) {
			System.out.println(i + "그룹");
			int n = 0;
			while (true) {
				n = userTypeInteger.in("정수: ");
				if (n == 88888 || n == 99999) {
					break;
				}
				sum[i] += n;
			}
			if (n == 99999) {
				break;
			}
		}

		System.out.println("합계: " + Arrays.stream(sum).sum());
	}
}
