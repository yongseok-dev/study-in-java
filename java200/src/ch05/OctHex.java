package ch05;

import userType.userTypeInteger;

//10진 정수를 8진수와 16진수로 표시
public class OctHex {
	public static void main(String[] args) {
		int n = userTypeInteger.in("정수: ");
		
		System.out.println(" 8진수는 "+trans(8,n));
		System.out.println("16진수는 "+trans(16,n));
	}

	private static String trans(int p, int n) {
		// n 진수 <- 10진수 변환
		String lit = "0123456789abcdefghizklmnopqrstuvwsxz";
		String result = "";
		while (n > 0) {
			result = lit.charAt(n % p) + result;
			n /= p;
		}

		return "" + result;
	}
}
