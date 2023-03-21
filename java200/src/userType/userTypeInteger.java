package userType;

import java.util.Scanner;

public class userTypeInteger {
	static public int in(String str) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println(str);
			try {
				n = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				n = 0;
			}
		} while (!(n > 0));
		return n;
	}
}
