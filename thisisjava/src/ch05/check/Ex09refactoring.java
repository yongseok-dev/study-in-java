package ch05.check;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09refactoring {
	private static Scanner stdin = new Scanner(System.in);
	private static int[] scores = new int[0];
	private static int state = 0; // 이전 단계를 기억하기

	public static void main(String[] args) {
		while (true) {
			menu();
			System.out.print("선택> ");
			int select = checkInt(stdin.nextLine());
			switch (select) {
			case 1 -> {
				System.out.print("학생수> ");
				scores = new int[checkInt(stdin.nextLine())];
				state = 1;
			}
			case 2 -> {
				if (state != 1) {
					System.out.println("학생수가 입력되어야 합니다.");
					break;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%nscores[%d]> ", i);
					scores[i] = checkInt(stdin.nextLine());
				}
				state = 2;
			}
			case 3 -> {
				if (state != 2) {
					System.out.println("학생 점수가 입력되어야 합니다.");
					break;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%nscores[%d]: %d", i, scores[i]);
				}
			}
			case 4 -> {
				if (state != 2) {
					System.out.println("학생 점수가 입력되어야 합니다.");
					break;
				}
				int[] sorted = scores;
				Arrays.sort(sorted);
				System.out.printf("%n최고점수: %d", sorted[sorted.length - 1]);
				System.out.printf("%n평균점수: %f", Arrays.stream(sorted).average().orElse(0));
				System.out.printf("%n최저점수: %d", sorted[0]);
			}
			case 5 -> {
				System.out.println("프로그램 종료");
				return;
			}
			default -> System.out.println("잘못된 입력입니다.");
			}
		}
	}

	public static void menu() {
		System.out.println("\n--------------------------------------------------------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("--------------------------------------------------------------");
	}

	public static int checkInt(String str) {
		if (!str.matches("\\d+")) {
			System.out.println("정수로 입력해 주세요.\n입력> ");
			return checkInt(stdin.nextLine());
		}
		return Integer.parseInt(str);
	}
}
