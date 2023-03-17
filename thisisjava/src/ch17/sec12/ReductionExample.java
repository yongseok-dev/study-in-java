package ch17.sec12;

import java.util.ArrayList;
import java.util.List;

import ch17.sec07.exam01.Student;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> sl = new ArrayList<>();

		sl.add(new Student("학생1", 90));
		sl.add(new Student("학생2", 70));
		sl.add(new Student("학생3", 80));

		int sum1 = sl.stream().mapToInt(s -> s.getScore()).sum();
		int sum2 = sl.stream().mapToInt(Student::getScore).sum();
		System.out.println(sum1);
		System.out.println(sum2);
		
		int sum3 = sl.stream().mapToInt(s -> s.getScore()).reduce(0,(a,b)->a+b);
		System.out.println(sum3);
	}
}
