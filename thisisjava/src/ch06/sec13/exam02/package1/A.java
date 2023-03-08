package ch06.sec13.exam02.package1;

public class A {// 같은 클래스 내부로 에러 없음
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	public A(Boolean b) {

	}

	A(int i) {

	}

	private A(String s) {

	}
}
