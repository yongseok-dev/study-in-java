package ch02.check;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x,y 연산");
		System.out.println("x> ");
		int x = stdIn.nextInt();
		System.out.println("y> ");
		int y = stdIn.nextInt();

		System.out.println("x+y: "+(x+y));
		System.out.println("x-y: "+(x-y));
		System.out.println("x*y: "+x*y);
		System.out.println("x/y: "+x/y);
		System.out.println("x%y: "+x%y);
	}

}
