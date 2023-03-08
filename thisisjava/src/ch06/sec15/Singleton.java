package ch06.sec15;

public class Singleton {
	// private static field
	private static Singleton singleton = new Singleton();
	
	// private constructor
	private Singleton() {
		
	}
	
	// public static getter
	public static Singleton getInstance() {
		return singleton;
	}
}
