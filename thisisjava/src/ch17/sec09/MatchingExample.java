package ch17.sec09;

import java.util.Arrays;

public class MatchingExample {
	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6 };
		boolean result = Arrays.stream(intArr).allMatch(a -> a % 2 == 0);
		System.out.println("2의배수: " + result);
		
		result = Arrays.stream(intArr).anyMatch(a -> a % 3 == 0);
		System.out.println("3의배수 있나?: " + result);
		
		result = Arrays.stream(intArr).noneMatch(a -> a % 3 == 0);
		System.out.println("3의배수 없나?: " + result);
		
	}
}
