package ch07.sec07;

public interface Service {
	default void defaulMethod1() {
		System.out.println("defaulMethod1 종속코드");
		defalutCommon();
	}
	
	default void defaulMethod2() {
		System.out.println("defaulMethod2 종속코드");
		defalutCommon();
	}
	
	private void defalutCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
		staticCommon();
	}

	static void staticCommon() {
		System.out.println("defaultMethod 중복 코드C");
		System.out.println("defaultMethod 중복 코드D");
		
	}
}
