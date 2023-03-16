package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {

		List<Board> list = new ArrayList<>();

		for (int i = 1; i < 6; i++) {
			list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
		}

		System.out.println(list.size());
		System.out.println(">>> 부분 출력");

		System.out
				.println(list.get(2).getSubject() + " | " + list.get(2).getContent() + " | " + list.get(2).getWriter());

		System.out.println(">>> 전체 출력");

		for (int i = 0; i < list.size(); i++) {
			Board item = list.get(i);
			System.out.println(item.toString());
		}
		System.out.println(">>> 삭제 후");
		
		list.remove(2);
		list.remove(2);
		
		for (Board item:list) {
			System.out.println(item.toString());
		}
		
		
	}
}
