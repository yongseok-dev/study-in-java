package ch03;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		// 정수값을 받아서 부호를 출력
		
		System.out.println("정수값> ");
		Scanner stdIn = new Scanner(System.in);
		int userType = stdIn.nextInt();
		
		System.out.println(userType>0?"+":userType<0?"-":"0");
		
	}

}
