package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> sl = new ArrayList<>();
		sl.add(new Student("학생1", 90));
		sl.add(new Student("학생2", 80));
		sl.add(new Student("학생3", 70));

		sl.stream().mapToInt(e -> e.getScore()).forEach(i -> System.out.println(i));
	}
}
