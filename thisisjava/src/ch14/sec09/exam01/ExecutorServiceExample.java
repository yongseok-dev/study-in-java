package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		System.out.println("1");
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		System.out.println("2");
		es.shutdownNow();
		System.out.println("3");
	}
}
