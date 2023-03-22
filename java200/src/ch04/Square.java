package ch04;

import userType.userTypeInteger;

//*을 나열해서 n단의 정방형을 표시하는 프로그램을 작성하자
public class Square {
	public static void main(String[] args) {
		int i = userTypeInteger.in("정방형을 표시합니다.\n단수는:");
		String line = "*".repeat(i);
		for (int j = 0; j < i; j++) {
//			for (int j2 = 0; j2 < i; j2++) {
//				System.out.print("*");
//			}
//			System.out.println();
			System.out.println(line);
		}
	}
}
