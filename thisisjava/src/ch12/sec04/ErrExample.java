package ch12.sec04;

public class ErrExample {
	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("aa");
		} catch (Exception e) {
			System.err.println("에러내용");
			System.err.println(e.getMessage());
		}
	}
}
