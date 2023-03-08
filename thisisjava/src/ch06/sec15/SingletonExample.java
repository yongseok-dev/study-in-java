package ch06.sec15;

import ch06.sec15.*;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton a = new Singleton(); //The constructor Singleton() is not visible
//		Singleton b = new Singleton(); //The constructor Singleton() is not visible

		Singleton a = Singleton.getInstance(); 
		Singleton b = Singleton.getInstance(); 
		System.out.println(a==b);
		System.out.println(a);
		
	}

}
