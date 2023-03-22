package ch06;

import java.time.Month;

import userType.UserType;

public class MonthCAI {
	public static void main(String[] args) {
		int n = 0;
		int check = 0;
		String[] monthNames = new String[12];
		for (int i = 0; i < 12; i++) {
			Month month = Month.of(i + 1);
			monthNames[i] = month.toString();
		}
		do {
			n = (int) (Math.random() * 12);
			do {
				String user = UserType.s((n + 1) + "월:");
				if (monthNames[n].equals(user)) {
					System.out.print("정답입니다.");
					break;
				}
			} while (true);
			do {
				check = UserType.i("다시한번? 1...Yes/0...No", "0+");
			} while (check > 1);

		} while (check == 1);

	}
}
