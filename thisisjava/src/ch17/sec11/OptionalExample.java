package ch17.sec11;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
		if (optional.isPresent()) {
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균: 0.0");
		}

		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("방법2_평균: " + avg);
		System.out.println("list add 10,20");
		list.add(10);
		list.add(20);
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a->System.out.println("방법3_평균: " + a));
	}
}
