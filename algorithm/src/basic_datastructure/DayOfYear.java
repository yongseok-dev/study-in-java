package basic_datastructure;

import userType.UserType;

public class DayOfYear {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };

	static boolean isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}

	static int dayOfYear(int y, int m, int d) {
		int days = d;
		for (int i = 1; i < m; i++) {
			days += mdays[isLeap(y) ? 1 : 0][i - 1];
		}
		return days;
	}

	static int leftDayOfYear(int y, int m, int d) {
		int days = -d;
		for (int i : mdays[isLeap(y) ? 1 : 0]) {
			days += i;
		}
		for (int i = 1; i < m; i++) {
			days -= mdays[isLeap(y) ? 1 : 0][i - 1];
		}
		return days;
	}

	static int dayOfYear2(int y, int m, int d) {
		int days = d;
		while (--m > 0) {
			days += mdays[isLeap(y) ? 1 : 0][m];
		}
		return days;
	}

	public static void main(String[] args) {
		int year = UserType.i("년: ");
		int month = UserType.i("월: ");
		int day = UserType.i("일: ");

		System.out.println(dayOfYear(year, month, day));
		System.out.println(leftDayOfYear(year, month, day));
	}
}
