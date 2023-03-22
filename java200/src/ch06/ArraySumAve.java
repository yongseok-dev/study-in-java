package ch06;

import java.util.Arrays;

import userType.UserType;

//double 배열의 모든 요소의 합과 평균을 구하는 프로그램을 작성, 요소수와 모든 요소의 값을 키보드를 통해 입력
public class ArraySumAve {
	public static void main(String[] args) {
		int n = UserType.i("요소 수: ","+");
		double[] arr = new double[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = UserType.d("a[" + i + "] = ");
		}
		double sum = Arrays.stream(arr).sum();
		double avg = Arrays.stream(arr).average().getAsDouble();
		
		System.out.println(sum);
		System.out.println(avg);
	}
}
