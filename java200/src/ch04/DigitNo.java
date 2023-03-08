package ch04;

import java.util.Scanner;

public class DigitNo {

	public static void main(String[] args) {
		// 양의 정숫값을 읽어서 그 자리수를 출력
		
		Scanner sn = new Scanner(System.in);

		System.out.println("정수를 입력해주세요.");
		int number = sn.nextInt();
		int count = 0;
		while(number>0) {
			count++;
			number/=10;			
		}
		System.out.println("자리수: "+count);
	}

}
