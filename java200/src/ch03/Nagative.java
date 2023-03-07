package ch03;

import java.util.Scanner;

public class Nagative {

	public static void main(String[] args) {
		// 키보드로 입력한 정수값이 음이면 "이 값은 음의 값입니다."라고 표시하는 프로그램 작성
		System.out.println("정수값> ");
		Scanner stdIn = new Scanner(System.in);
		int userType = stdIn.nextInt();
		if(userType<0) {
			System.out.println("이 값은 음의 값입니다.");			
		}
	}

}
