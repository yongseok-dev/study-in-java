package ch03;

import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {
		// 입력한 정수값을 3으로 나눠 떨어짐, 나머지, 음수로 출력
		System.out.println("type> ");
		Scanner stdIn = new Scanner(System.in);
		int userType = stdIn.nextInt();
		String msg;
		if(userType<0) {
			msg = "음수를 입력하셨습니다.";
		}else {
			if(userType%3==0) {
				msg = "나누어 떨어집니다.";							
			}else {
				msg = "나머지는 "+userType%3+"입니다";			
			}
		}
		System.out.println(msg);
	}

}
