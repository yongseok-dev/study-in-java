package ch03;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		// a,b 대소관계 표시 프로그램
		Scanner stdIn = new Scanner(System.in);
		System.out.println("A> ");
		int userTypeA = stdIn.nextInt();
		System.out.println("B> ");
		int userTypeB = stdIn.nextInt();

		if(userTypeA==userTypeB) {
			System.out.printf("%d는 %d와 같습니다.",userTypeA,userTypeB);
		}else if(userTypeA>userTypeB){
			System.out.printf("A(%d)는 B(%d)보다 크다.",userTypeA,userTypeB);
		}else {
			System.out.printf("A(%d)는 B(%d)보다 작다.",userTypeA,userTypeB);
		}
	}

}
