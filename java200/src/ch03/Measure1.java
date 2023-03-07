package ch03;

import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		// 2개의 양의 정숫값을 읽어서, 후자가 전자의 약수이면 "B는 A의 약수이다.", 아니면 "B는 A의 약수가 아니다."라고 출력
		Scanner stdIn = new Scanner(System.in);
		System.out.println("A> ");
		int userTypeA = stdIn.nextInt();
		System.out.println("B> ");
		int userTypeB = stdIn.nextInt();

		if(userTypeA%userTypeB==0) {
			System.out.printf("%d는 %d의 약수이다.",userTypeB,userTypeA);
		}else {
			System.out.printf("%d는 %d의 약수가 아니다.",userTypeB,userTypeA);
		}
	}

}
