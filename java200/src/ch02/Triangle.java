package ch02;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// 삼각형의 넣이를 구해서 표시
		Scanner stdin = new Scanner(System.in);
		System.out.print("밑변의 길이를 입력해 주세요.");
		double a = stdin.nextDouble();
		System.out.print("\n높이의 길이를 입력해 주세요.");
		double h = stdin.nextDouble();

		System.out.print("\n삼각형의 넓이는 "+(a*h/2)+"입니다.");
		
	}

}
