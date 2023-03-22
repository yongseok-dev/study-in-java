package ch04;

import userType.userTypeInteger;

public class SumContinueAve {
	public static void main(String[] args) {
		// 읽은 정수를 합산 음수는 제외
		int n = userTypeInteger.in("정수를 더합니다\n몇 개를 더할까요?");
		int sum = 0;
		int count = 0;
		int i;
		for (i = 0; i < n; i++) {
			int t = userTypeInteger.full("정수: ");
			if (t < 0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			}
			sum += i;
			count++;
		}

		double avg = (double) sum / count;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
