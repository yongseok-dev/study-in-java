package ch17.sec13.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ch17.sec13.exam02.Student;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 82));
		totalList.add(new Student("김자바", "남", 84));
		totalList.add(new Student("오해영", "여", 83));

		Map<String, Double> map = totalList.stream()
				.collect(Collectors.groupingBy(s -> s.getSex(), Collectors.averagingDouble(s -> s.getScore())));
		System.out.println(map);
	}
}
