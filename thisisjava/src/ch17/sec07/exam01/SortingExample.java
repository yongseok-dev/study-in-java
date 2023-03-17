package ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> sl = new ArrayList<>();
		sl.add(new Student("학생1", 90));
		sl.add(new Student("학생2", 70));
		sl.add(new Student("학생3", 80));
		sl.stream().forEach(e -> System.out.print(e.getName() + "(" + e.getScore() + ") "));
		
		System.out.println();
		
		sl.stream().sorted().forEach(e->System.out.print(e.getName() + "(" + e.getScore() + ") "));
		System.out.println();
		sl.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e.getName() + "(" + e.getScore() + ") "));
	}
}
