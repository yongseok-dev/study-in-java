package ch17.sec04.exam02;

import java.util.*;

public class StreamExample {
	public static void main(String[] args) {
		String[] strArray = { "홍길동", "나상실", "자르반", "김자바" };
		Arrays.stream(strArray).forEach(e -> System.out.println(e.toString()));
		
		int[] intArray = {1,2,3,4,5};
		
		Arrays.stream(intArray).forEach(i->System.out.println(i));
	}

}
