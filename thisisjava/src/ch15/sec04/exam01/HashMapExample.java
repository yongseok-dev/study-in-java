package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 75);
		map.put("동장군", 80);
		map.put("신용권", 95);

		System.out.println(map.size());

		String key = "홍길동";
		int vlaue = map.get(key);
		System.out.println(key + ": " + vlaue);
		System.out.println();

		Set<String> ks = map.keySet();
		for (String str : ks) {
			System.out.println(str + ": " + map.get(str));
		}

		Set<Entry<String, Integer>> es = map.entrySet();
		Iterator<Entry<String, Integer>> ei = es.iterator();
		
		while(ei.hasNext()) {
			Entry<String, Integer> e = ei.next();
			String k = e.getKey();
			Integer v = e.getValue();
			System.out.println(k+": "+v);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println(map.size());
		System.out.println();
	}
}
