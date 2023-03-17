package ch17.sec13.exam02;

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

		
		Map<String, List<Student>> map = totalList.stream().collect(Collectors.groupingBy(s->s.getSex()));
		System.out.println("남성");
		map.get("남").forEach(s->System.out.println(s.getName()));
		System.out.println("");
		System.out.println("여성");
		map.get("여").forEach(s->System.out.println(s.getName()));
	}
}
