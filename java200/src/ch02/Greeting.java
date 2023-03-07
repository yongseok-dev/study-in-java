package ch02;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		// 키보드로 입력한 성과 이름과 인사 출력하는 프로그램
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("성> ");
		String lastName = stdin.nextLine();
		System.out.print("\n이름> ");
		String firstName = stdin.nextLine();
		
		System.out.printf("%n안녕하세요. %s%s님!",lastName,firstName);		
	}

}
