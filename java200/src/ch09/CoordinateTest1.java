package ch09;

import java.util.Scanner;

import userType.UserType;

public class CoordinateTest1 {
	static boolean comCoordinate(Coordinate c1, Coordinate c2) {
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}

	public static void main(String[] args) {
		System.out.println("좌표 p를 입력하세요.");
		double x = UserType.d("x좌표");
		double y = UserType.d("y좌표");

		Coordinate p = new Coordinate(x, y);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		System.out.println("좌표 q를 입력하세요.");
		x = UserType.d("x좌표");
		y = UserType.d("y좌표");
		
		Coordinate q = new Coordinate(x, y);
		System.out.println("q = (" + q.getX() + ", " + q.getY() + ")");

		System.out.println(comCoordinate(p, q));		

	}
}
