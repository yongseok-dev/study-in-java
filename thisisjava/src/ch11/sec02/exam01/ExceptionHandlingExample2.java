package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자수" + result);
		} catch (Exception e) {
			System.out.println("1) "+e);
			System.out.println("2) "+e.getMessage());
			System.out.println("3) "+e.toString());
			System.out.print("4) ");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");

		printLength("ThisIsJava");
		printLength(null);

		System.out.println("[프로그램 종료]");
	}
}
