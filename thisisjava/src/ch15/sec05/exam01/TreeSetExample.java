package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
//		Set<Integer> scores = new HashSet<>();
		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(87);
		scores.add(75);
		scores.add(97);
		scores.add(67);
		scores.add(70);
		scores.add(88);
		scores.add(90);

		for (Integer i : scores) {
			System.out.println(i);
		} // 오름차순
		System.out.println();
		System.out.println(">최저");
		System.out.println(scores.first());
		System.out.println(">최고");
		System.out.println(scores.last());
		System.out.println(">70위");
		System.out.println(scores.higher(70));
		System.out.println(">70아래");
		System.out.println(scores.lower(70));
		System.out.println(">70 이거나 바로아래");
		System.out.println(scores.floor(70));
		System.out.println(">75 이거나 바로위");
		System.out.println(scores.ceiling(75));

		// 내림차순
		NavigableSet<Integer> ds = scores.descendingSet();
		System.out.println(">> 내림차순");
		for (Integer i : ds) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		// 범위검색
		System.out.println(">> 범위검색");
		NavigableSet<Integer> rs = scores.tailSet(80, true);
		for (Integer i : rs) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println(">> 범위검색 80<=score<90");
		rs = scores.subSet(80, true, 90, false);
		for (Integer i : rs) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
