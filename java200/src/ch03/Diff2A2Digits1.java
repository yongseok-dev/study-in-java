package ch03;

import java.util.Scanner;

public class Diff2A2Digits1 {

	public static void main(String[] args) {
		// 두 정수의 차
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a> ");
		int a = stdIn.nextInt();
		System.out.println("b> ");
		int b = stdIn.nextInt();
		if(Math.abs(a-b)<=10) {
			System.out.println("a,b 두 수의 차는 10 이하입니다.");			 
		}else {
			System.out.println("a,b 두 수의 차는 11 이상입니다.");			 
		}
	}

}
