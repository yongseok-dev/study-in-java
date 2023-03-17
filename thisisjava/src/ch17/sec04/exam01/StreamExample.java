package ch17.sec04.exam01;

import java.util.*;

public class StreamExample {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			Product pd = new Product(i, "상품" + i, "멋진회사" + i, (int) (Math.random() * 10000));
			list.add(pd);
		}
		list.stream().forEach(p->System.out.println(p));

	}
}
