package ch04;

import userType.userTypeInteger;

//신장별 표준 체중 대응표를 표시하는 프로그램을 작성하자
public class HeightWeight {
	public static void main(String[] args) {
		int start = userTypeInteger.in("몇 cm부터 : ");
		int end = userTypeInteger.in("몇 cm까지 : ");
		int unit = userTypeInteger.in("몇 cm단위 : ");
		for (int i = start; i <= end; i += unit) {
			System.out.println(i + " " + (i - 100) * 0.9);
		}
	}
}
