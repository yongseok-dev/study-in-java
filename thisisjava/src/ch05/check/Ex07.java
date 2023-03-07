package ch05.check;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int answer = Arrays.stream(array).max().getAsInt();
		System.out.print(answer);
	}
}
