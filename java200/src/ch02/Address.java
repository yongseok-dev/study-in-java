package ch02;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		// 사용자 주소를 입력받아 출력
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("주소를 입력해주세요.");
		String add = stdin.nextLine();
		System.out.println(add+"입니다.");
		
	}

}
