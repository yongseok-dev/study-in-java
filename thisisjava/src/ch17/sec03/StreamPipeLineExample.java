package ch17.sec03;

import java.util.*;

public class StreamPipeLineExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 10), new Student("김자바", 20), new Student("금잔디", 30),
				new Student("이자성", 40));

		double avg = list.stream()
				.mapToInt(s -> s.getScore())
				.average()
				.getAsDouble();
		
		System.out.println(avg);
	}
}
