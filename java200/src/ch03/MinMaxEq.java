package ch03;

import java.util.Scanner;

public class MinMaxEq {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.println("a>");
		int a = sn.nextInt();
		System.out.println("b>");
		int b = sn.nextInt();
		if(a==b) {
			System.out.println("둘이 같다.");			
		}else {
			System.out.printf("큰값 %d%n작은값 %d",a>b?a:b,a<b?a:b);						
		}
	}

}
