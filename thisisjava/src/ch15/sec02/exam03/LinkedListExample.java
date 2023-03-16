package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		System.out.println("index 0 add");
		System.out.println("ArrayList");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(endTime-startTime);
		System.out.println();
		
		System.out.println("LinkedList");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(endTime-startTime);
		System.out.println();
		
		System.out.println("end add");
		System.out.println("ArrayList");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(endTime-startTime);
		System.out.println();
		
		System.out.println("LinkedList");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(endTime-startTime);
		System.out.println();
		
	}
}
