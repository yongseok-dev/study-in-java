package ch17.sec13.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 82));
		totalList.add(new Student("김자바", "남", 84));
		totalList.add(new Student("오해영", "여", 83));

		List<Student> meleList = totalList.stream().filter(s -> s.getSex().equals("남")).collect(Collectors.toList());
		meleList.forEach(s -> System.out.println(s.getName()));

		Map<String, Integer> map = totalList.stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
		System.out.println(map);
	}
}
