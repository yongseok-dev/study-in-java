package ch03;

import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		// 두 정수의 차
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a> ");
		int a = stdIn.nextInt();
		System.out.println("b> ");
		int b = stdIn.nextInt();
		System.out.println(Math.abs(a-b));
	}

}
