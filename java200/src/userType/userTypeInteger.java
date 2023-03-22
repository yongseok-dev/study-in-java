package userType;

import java.util.Scanner;

public class userTypeInteger {
	static public int in(String str) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print(str);
			try {
				n = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				n = 0;
			}
		} while (!(n > 0));
		return n;
	}

	static public int zero(String str) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print(str);
			try {
				n = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				n = 0;
			}
		} while (!(n > -1));
		return n;
	}

	static public int full(String str) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
			System.out.print(str);
			try {
				n = Integer.parseInt(sc.nextLine());				
			} catch (Exception e) {
				n = full(str);				
			}
		return n;
	}
}
