package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "9508051234567";

		int length = ssn.length();

		if (length == 13) {
			System.out.print("주민등록번호의 자릿수가 맞습니다.");
		} else {
			System.out.print("주민등록번호의 자릿수가 틀립니다.");
		}
	}
 
}
