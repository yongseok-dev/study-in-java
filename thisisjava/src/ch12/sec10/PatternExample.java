package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String phoneNumber = "010-1234-4567";
		System.out.println(isPhoneNumber(phoneNumber));

		String email = "abc@gmail.com";
		System.out.println(isEmail(email));

	}

	static boolean isPhoneNumber(String str) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		return Pattern.matches(regExp, str);
	}

	static boolean isEmail(String str) {
		String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		return Pattern.matches(regExp, str);
	}
}
