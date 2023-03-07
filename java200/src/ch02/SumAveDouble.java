package ch02;

import java.util.Scanner;

public class SumAveDouble {

	public static void main(String[] args) {
		// 2개의 실수값을 입력받아 그 합과 평균을 구하는 프로그램
		Scanner stdin = new Scanner(System.in);
		System.out.println("1번 실수를 입력해 주세요.");
		double x = stdin.nextDouble();
		System.out.println("2번 실수를 입력해 주세요.");
		double y = stdin.nextDouble();
		double sum = x+y;
		System.out.println(sum);
		System.out.println(sum/2);
	}

}
