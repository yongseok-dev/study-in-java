package ch09;

import java.util.Scanner;

import userType.UserType;

public class CoordinateTest2 {

	public static void main(String[] args) {
		System.out.println("좌표 p를 입력하세요.");
		double x = UserType.d("x좌표");
		double y = UserType.d("y좌표");
		
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = ("+p.getX()+", "+p.getY()+")");
		
		Coordinate q = p;
		q.setX(9.9);
		q.setY(9.9);
		System.out.println("p = ("+p.getX()+", "+p.getY()+")");
		System.out.println("q = ("+q.getX()+", "+q.getY()+")");
		
	}
}
