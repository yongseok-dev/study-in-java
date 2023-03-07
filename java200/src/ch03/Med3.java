package ch03;

import java.util.Scanner;

public class Med3 {

	public static void main(String[] args) {
		// 중앙값
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a> ");
		int a = stdIn.nextInt();
		System.out.println("b> ");
		int b = stdIn.nextInt();
		System.out.println("c> ");
		int c = stdIn.nextInt();
		System.out.println(a > b ? b > c ? b : a > c ? c : a : a > c ? a : b > c ? c : b);// 너무 복잡하다.

		if ((a > b && b > c) || (c > b && b > a)) {
			System.out.println(b);
		} else if ((b > a && a > c) || (c > a && a > c)) {
			System.out.println(a);
		} else if ((a > c && c > b) || (b > c && c > a)) {
			System.out.println(c);
		} else {
			if (a == b) {
				System.out.println(a);
			} else if (b == c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}

	    int median = findMedian(a, b, c);
	    System.out.println("중앙값: " + median);
	    
		System.out.println(a + " " + b + " " + c);
	}

	public static int findMedian(int a, int b, int c) {
		if (a > b) {
			if (b > c) {
				return b;
			} else if (a > c) {
				return c;
			} else {
				return a;
			}
		} else {
			if (a > c) {
				return a;
			} else if (b > c) {
				return c;
			} else {
				return b;
			}
		}
	}
}
