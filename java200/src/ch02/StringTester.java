package ch02;

public class StringTester {

	public static void main(String[] args) {
		// String 형의 변수를 문자열로 초기화하거나 변수에 문자열을 대입하는 프로그램을 작성하자.
		
		String a = "abc";
		String b = "xyz";
		
		System.out.println(a+" "+b);
		
		a = "def";
		b = new String("xyz");
//		b = "xyz";
		
		System.out.println(a+" "+b);
		

	}

}
