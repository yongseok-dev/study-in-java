package userType;

import java.util.Scanner;

public class UserType {
	static Scanner sc = new Scanner(System.in);

	static public double d(String str) {
		double n = 0;
		System.out.print(str);
		try {
			n = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {
			n = d(str);
		}
		return n;
	}

	static public int i(String str) {
		int n = 0;
		System.out.print(str);
		try {
			n = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			n = i(str);
		}
		return n;
	}

	static public int i(String str, String sign) {// sign "-" "-0" "-0+" "0+" "+"
		int n = 0;
		System.out.print(str);
		try {
			n = Integer.parseInt(sc.nextLine());
			if ((n > 0 && !sign.contains("+")) || (n < 0 && !sign.contains("-")) || (n == 0 && !sign.contains("0"))) {
				n = i(str, sign);
			}
		} catch (Exception e) {
			n = i(str);
		}
		return n;
	}

	static public String s(String str) {
		System.out.print(str);
		String s = sc.nextLine();
		if ("".equals(s)) {
			s = s(str);
		}
		return s;
	}
}
