package ch04.check;

import java.util.Scanner;

public class Ext {

	public static void main(String[] args) {
		// 숫자 맞히기(1~100)사이 수 게임 업다운
		int number = (int) (Math.random()*100+1);
		int count = 0;
		
		System.out.println("1~100 사이의 숫자 맞히기 게임입니다.");
		Scanner scanner = new Scanner(System.in);		
		
		int userNumber = 0;
		
		while(number!=userNumber) {
			System.out.println("입력>");
			userNumber = Integer.parseInt(scanner.nextLine());
			
			if(number>userNumber){
				System.out.printf("%d 보다 큰 수입니다.\n",userNumber);
			}
			else {
				System.out.printf("%d 보다 작은 수입니다.\n",userNumber);
			}
			count++;
		} 
		System.out.printf("%d 맞습니다. 시도횟수 %d회", userNumber , count);
        scanner.close();
	}

}
