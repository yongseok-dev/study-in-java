package ch02;

import java.util.Scanner;

public class LowestDigit {
	public static void main(String[] args) {
		//키보드에서 입력한 정숫 값에 마지막 자릿수를 제외한 값과 마지막 자릿수를 표시
		Scanner stdin = new Scanner(System.in);
		//입력
		System.out.println("integer input! > ");
		int userInput = stdin.nextInt();
		
		//가공
		
		//출력
		System.out.println(userInput/10);
		System.out.println(userInput%10);
	}

}
