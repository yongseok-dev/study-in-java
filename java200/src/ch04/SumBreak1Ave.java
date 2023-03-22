package ch04;

import userType.userTypeInteger;

//정숫값을 연속으로 입력 받아 합계 와 평균을 구하는 프로그램을 작성 숫자 0으로 종료
public class SumBreak1Ave {
	public static void main(String[] args) {
		System.out.println("정수를 더합니다.");
		int n = userTypeInteger.in("몇 개를 더할까요?: ");

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = userTypeInteger.zero("정수(0으로 종료):");
			if (arr[i] == 0) {
				n = i;
				break;
			}
		}

		int sum = 0;
		double avg = 0;
		for (int i : arr) {
			sum += i;
		}
		avg = sum / n;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
