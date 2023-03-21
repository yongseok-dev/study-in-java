package ch04;

import java.util.Scanner;

//양의 정숫값 n을 읽어서 1부터 n까지의 곱을 구하는 프로그램을 작성하자.
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("양의 정수를 입력해 주세요.");
			try {
				n = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				n = 0;
			}
		} while (!(n > 0));
		int answer = 1;
		for (int i = 1; i <= n; i++) {
			answer *= i;
		}
		System.out.println("n! = " + answer);
	}

}
