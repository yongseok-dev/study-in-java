package ch07;

import userType.UserType;

//정수 x를 오른쪽으로 n비트 회전한 값을 반환하는 rRotate 메서드와 왼쪽으로 n비트 회전한 값을 반환하는 IRotate 메서드를 작성하자.
// int rRotate(int x, int n)
// int lRotate(int x, int n)
// 회전이란 최하위 비트와 최상위 비트가 연결돼 있다고 간주하는 것.
public class Rotate {
	private static String rRotate(int x, int n) {
		String s = "";
		String t = "";
		for (int i = 0; i < 32; i++) {
			if(i<n) {
				t = x % 2 + t;
			}else {				
				s = x % 2 + s;
			}
			x /= 2;			
		}
		return t+s;
	}

	private static String lRotate(int x, int n) {
		String s = "";
		String t = "";
		for (int i = 0; i < 32; i++) {
			if(n+i>32) {
				t = x % 2 + t;
			}else {				
				s = x % 2 + s;
			}
			x /= 2;			
		}
		return s+t;
	}

	private static String toBit(int x) {
		String s = "";//int 32bit
		for (int i = 0; i < 32; i++) {
			s = x % 2 + s;
			x /= 2;			
		}
		return s;
	}

	public static void main(String[] args) {
		int x = UserType.i("정수x를 n비트 회전합니다.\nx: ");
		int n = UserType.i("n: ");
		System.out.println("회전 전 = " + toBit(x));

		System.out.println("오른쪽 회전 = " + rRotate(x, n));
		System.out.println("왼쪽 회전 = " + lRotate(x, n));
	}
}
