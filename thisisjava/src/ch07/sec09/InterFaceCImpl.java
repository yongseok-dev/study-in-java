package ch07.sec09;

public class InterFaceCImpl implements InterfaceC {
	// 인터페이스에 추상화된 메서드를 하나라도 구현하지 않으면 에러 발생
	// The type InterFaceCImpl must implement the inherited abstract method

	public void methodA() {
		System.out.println("A");
	}

	public void methodB() {
		System.out.println("B");
	}

	public void methodC() {
		System.out.println("C");
	}
}
