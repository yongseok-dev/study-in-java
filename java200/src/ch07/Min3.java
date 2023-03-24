package ch07;

import userType.UserType;

public class Min3 {
	static int min(int a, int b, int c) {
		int min = a;
		if(min>b)min=b;
		if(min>c)min=c;		
		return min;
	}
	public static void main(String[] args) {
		int a = UserType.i("정수 a: ");
		int b = UserType.i("정수 b: ");
		int c = UserType.i("정수 c: ");
		System.out.println(min(a,b,c));
	}
}
