package ch09;

import java.util.Scanner;

import userType.UserType;

public class CoordinateTest3 {

	public static void main(String[] args) {

		System.out.println();
		int n = UserType.i("생성할 좌표의 수를 입력하세요", "+");

		Coordinate[] c = new Coordinate[n];

		for (int i = 0; i < c.length; i++) {
			c[i] = new Coordinate(1, 1);
		}
		
		for (Coordinate p : c) {
			System.out.println("c = (" + p.getX() + ", " + p.getY() + ")");
		}
	}
}
