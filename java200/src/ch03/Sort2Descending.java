package ch03;

import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
		// 2개의 정수를 읽어서 내림차순으로 정렬
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a> ");
		int a = stdIn.nextInt();
		System.out.println("b> ");
		int b = stdIn.nextInt();
		
		if(a<b) {
			int temp = a;
			a=b;
			b=temp;
		}
		System.out.println(a+" "+b);

	}

}
