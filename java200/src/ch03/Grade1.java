package ch03;

import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		// 수우미양가 판정 프로그램
		Scanner stdIn = new Scanner(System.in);
		System.out.println("점수 100~0> ");
		int userType = stdIn.nextInt();
		if(100>=userType && userType>=90) {
			System.out.println("수");
		}else if(90>=userType && userType>=80) {
			System.out.println("우");			
		}else if(80>=userType && userType>=70) {
			System.out.println("미");			
		}else if(70>=userType && userType>=60) {
			System.out.println("양");			
		}else if(60>=userType && userType>=50) {
			System.out.println("가");			
		}else{
			System.out.println("올바른 범위 값을 입력하세요.");			
		}
	}

}
