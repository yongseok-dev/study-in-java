package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍진희");
		list.add("홍금순");
		list.add("신금순");
		list.add("진금순");
		list.add("홍경래");
		list.add("홍경래");
		list.add("홍진경");
		list.add("홍철");
		System.out.println(">> 입력 후바로 출력");
		list.forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println(">> 필터링 후 출력");
		list.stream().distinct().forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println(">> 필터링, 중복제거 후 출력");
		list.stream().distinct().filter(s -> s.startsWith("홍")).forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println(">>테스트");
		list.stream().distinct()
		.filter(s -> s.length() > 1 && s.split("")[1].equals("진"))
				.forEach(s -> System.out.print(s + " "));
	}
}
