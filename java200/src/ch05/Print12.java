package ch05;

// 8진수 10진수 16진수 12를 10진수로 표시하는 프로그램 작성
public class Print12 {
	public static void main(String[] args) {
		String n = "12";

		System.out.println(" 8진수 12는 10진수로 " + trans(8, n));
		System.out.println("10진수 12는 10진수로 " + trans(10, n));
		System.out.println("16진수 12는 10진수로 " + trans(16, n));
	}

	private static String trans(int p, String n) {
		// n 진수 -> 10진수 변환
		String lit = "0123456789abcdefghizklmnopqrstuvwsxz";
		int result = 0;
		String[] arr = n.split("");

		for (int i = 0; i < arr.length; i++) {
			result += (Math.pow(p, i) * lit.indexOf(arr[arr.length - i - 1]));
		}

		return "" + result;
	}
}
