package ch02;

import java.util.Scanner;

public class Globe {

	public static void main(String[] args) {
		// 구의 부피와 겉넓이를 구하는 프로그램
		Scanner stdin = new Scanner(System.in); 
		System.out.println("반지름> ");
		double r = Double.parseDouble(stdin.nextLine());
		double s = Math.PI*r*r*4;		
		double v = Math.PI*r*r*r*4/3;
		System.out.println("넓이: "+s);
		System.out.println("부피: "+v);

	}

}
