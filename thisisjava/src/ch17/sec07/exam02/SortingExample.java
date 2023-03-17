package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

import ch17.sec07.exam01.Student;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> sl = new ArrayList<>();

		sl.add(new Student("학생1", 90));
		sl.add(new Student("학생2", 70));
		sl.add(new Student("학생3", 80));
		sl.stream().sorted((s1,s2)->Integer.compare(s1.getScore(), s2.getScore())).forEach(e->System.out.print(e.getName() + "(" + e.getScore() + ") "));	
		System.out.println();
		sl.stream().sorted((s2,s1)->Integer.compare(s1.getScore(), s2.getScore())).forEach(e->System.out.print(e.getName() + "(" + e.getScore() + ") "));	
		System.out.println();
		//원본에 영향을 주지 않는다.
		sl.stream().forEach(e -> System.out.print(e.getName() + "(" + e.getScore() + ") "));
	}
}
