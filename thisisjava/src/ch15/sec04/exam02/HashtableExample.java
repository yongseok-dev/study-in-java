package ch15.sec04.exam02;

import java.util.*;

public class HashtableExample {
	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<>(); //1825, 1831, ...
		Map<String, Integer> map = new Hashtable<>();

		Thread ta = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		
		Thread tb = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		ta.start();
		tb.start();
		
		try {
			ta.join();
			tb.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(map.size());
	}
}
