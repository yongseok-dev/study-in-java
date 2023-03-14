package ch11.sec05;

public class ThrowsExample2 {
	public static void main(String[] args) throws Exception {
		System.out.println("시작");
		findClass();
		System.out.println("종료");
	}
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}
