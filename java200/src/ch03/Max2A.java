package ch03;

import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		// 2개의 실수 값 중 큰 것을 출력
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a> ");
		double a = stdIn.nextDouble();
		System.out.println("b> ");
		double b = stdIn.nextDouble();
		System.out.println(a>b?a:a<b?b:"=");
	}

}
