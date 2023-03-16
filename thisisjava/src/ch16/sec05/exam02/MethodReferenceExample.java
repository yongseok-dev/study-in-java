package ch16.sec05.exam02;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person ps = new Person();
		ps.ordering(String :: compareToIgnoreCase);
	}
}
