package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");
		set.add("Spring");

		System.out.println(set.size());
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			System.out.println((String) iterator.next());
		}
	}
}
