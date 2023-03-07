package ch03;

import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		// 3개의 정수를 읽어서 내림차순으로 정렬
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a> ");
		int a = stdIn.nextInt();
		System.out.println("b> ");
		int b = stdIn.nextInt();
		System.out.println("c> ");
		int c = stdIn.nextInt();

		int temp;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (a < c) {
			temp = a;
			a = c;
			c = temp;
		}
		if (b < c) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a + " "+ b + " " + c);

	}

}
