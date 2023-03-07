package ch05.sec10;

public class Testfor {

	public static void main(String[] args) {
		// for 문 비교

		int[] a = { 1, 2, 3, 4, 5, 6 };
		for1(a);
		for2(a);

	}

	public static void for1(int[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]);
		}
	}

	public static void for2(int[] args) {
		for (int i : args) {
			System.out.print(i);
		}
	}
}
