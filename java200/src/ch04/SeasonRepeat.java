package ch04;

import userType.userTypeInteger;

public class SeasonRepeat {
	public static void main(String[] args) {
		String[] strArr = { "겨울", "봄", "여름", "가을" };
		int n = 0;
		int rn = 0;
		System.out.println("계절을 찾습니다.");
		do {

			do {
				n = userTypeInteger.in("몇 월입니까?");
			} while (n > 12 || n < 1);
			System.out.println(strArr[n % 12 / 3]);
			rn = userTypeInteger.in("다시 하겠습니까? 1...Yes / 2...No");
		} while (rn == 1);
	}
}
