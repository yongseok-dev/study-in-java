package ch05;

import java.util.Scanner;

public class FloatDoubleScanPrinit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x : ");
		float x = Float.parseFloat(sc.nextLine());
		System.out.print("y : ");
		double y = Double.parseDouble(sc.nextLine());
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}
