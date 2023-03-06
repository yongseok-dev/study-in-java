package ch02;

import java.util.Scanner;

public class PlusMinus10 {

	public static void main(String[] args) {
		// 키보드에 입력한 정숫값에 10을 더하거나 뺀 값을 표시
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("값을 입력해주세요.");
		int inputValue = stdIn.nextInt();
		

		System.out.println("입력값 +10");
		System.out.println(inputValue+10);
		System.out.println("입력값 -10");
		System.out.println(inputValue-10);

	}

}
