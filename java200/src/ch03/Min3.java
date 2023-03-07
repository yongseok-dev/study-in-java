package ch03;

import java.util.Scanner;

public class Min3 {

	public static void main(String[] args) {
		// 3 정수의 최소값
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a> ");
		int a = stdIn.nextInt();
		System.out.println("b> ");
		int b = stdIn.nextInt();
		System.out.println("c> ");
		int c = stdIn.nextInt();
		System.out.println(a>b?(b>c?c:b):(a>c?c:a));//if 분기가 꼭 필요한가?
	}

}
