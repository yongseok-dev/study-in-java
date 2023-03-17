package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i'm developer");
		list1.stream().flatMap(d -> Arrays.stream(d.split(" "))).forEach(w -> System.out.println(w));

		List<String> list2 = Arrays.asList("10, 20, 30, 40, 50");
		list2.stream().flatMapToInt(d -> {
			String[] strArr = d.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < intArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		}).forEach(n -> System.out.println(n));
	}
}
