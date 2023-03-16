package ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;

import ch15.sec02.exam01.Board;

public class VectorExample {
	public static void main(String[] args) {
//		List<Board> list = new ArrayList<>();//add가 씹히는 경우가 생긴다.
		List<Board> list = new Vector<>();
		Thread ta = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		Thread tb = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};

		ta.start();
		tb.start();
		// add 순서는 스레드에 달렸다.

		try {
			ta.join();
			tb.join();
		} catch (Exception e) {
		}
		int size = list.size();
		System.out.println(size);
		System.out.println();
		for (Board board : list) {
			System.out.println(board);
		}
	}
}
