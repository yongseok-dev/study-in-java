package ch04;

import java.util.Scanner;

public class PutAsteriskAlt1 {

	public static void main(String[] args) {
		// 입력 값의 개수만큼 *와+를 번갈아가며 표시하는 프로그램
		Scanner sn = new Scanner(System.in);

		System.out.println("정수를 입력해주세요.");
		int number = sn.nextInt();
		if (number > 0) {
			// 1
			System.out.println("*+".repeat(number/2)+(number%2==0?"":"*"));
			// 2
			while (number-- > 0) {
				if(number%2==0) {
					System.out.print("*");					
				}else {
					System.out.print("+");										
				}
			}
			System.out.print("\n");
		}
	}

}
