package ch06;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import userType.userTypeInteger;

public class PointSumAvg {
	public static void main(String[] args) {
		int n = userTypeInteger.in("사람 수: ");
		System.out.println("점수를 입력하세요.");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = userTypeInteger.zero((i + 1) + "번의 점수: ");
		}
		
		int sum = Arrays.stream(arr).sum();
		double avg = Arrays.stream(arr).average().getAsDouble();
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
	}
}
