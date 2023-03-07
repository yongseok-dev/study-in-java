package ch03;

import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
		// input 10배수 "이 값은 10의 배수입니다."
		// else "이 값은 10의 배수가 아닙니다."
		// 음수 -> "음의 정수를 입력했습니다."
		System.out.println("type> ");
		Scanner stdIn = new Scanner(System.in);
		int userType = stdIn.nextInt();
		String msg;
		if(userType<0) {
			msg = "음의 정수를 입력했습니다.";
		}else {
			if(userType%10==0&userType>0) {
				msg = "이 값은 10의 배수입니다.";
			}else {
				msg = "이 값은 10의 배수가 아닙니다.";
			}
		}
		System.out.println(msg);
	}

}
