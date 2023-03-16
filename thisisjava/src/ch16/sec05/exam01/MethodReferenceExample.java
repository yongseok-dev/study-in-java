package ch16.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person ps = new Person();
		ps.action(Computer::staticMethod);
		
		Computer com = new Computer();
		ps.action(com::instanceMethod);
	}
}
