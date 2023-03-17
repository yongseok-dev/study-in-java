package ch17.sec02;

import java.util.*;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("김자반");
		list.add("감자밭");		
		list.add("김길동");
		list.add("금자바");
		list.add("이기자");
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name->{
			System.out.println(name+" : "+Thread.currentThread().getName());
		});//자동으로 쓰레드 할당해서 진행시킴
	}
}
