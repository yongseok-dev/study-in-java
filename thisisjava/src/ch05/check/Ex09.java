package ch05.check;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int[] scores = new int[0];
		int state = 0; // 이전 단계를 기억하기
		while (true) {
			menu();
			System.out.print("선택> ");
			int select = checkInt(stdin.nextLine());
			if (1 == select) {
				System.out.print("학생수> ");
				scores = new int[checkInt(stdin.nextLine())];
				state = 1;
			} else if (2 == select & state == 1) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%nscores[%d]> ", i);
					scores[i] = checkInt(stdin.nextLine());
				}
				state = 2;
			} else if (3 == select & state == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%nscores[%d]: %d", i, scores[i]);
				}

			} else if (4 == select & state == 2) {
				System.out.printf("%n최고점수: %d", maxScores(scores));
				System.out.printf("%n평균점수: %f", avgScores(scores));
				System.out.printf("%n최저점수: %d", minScores(scores));

			} else if (5 == select) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("학생수와 점수가 입력되어야 합니다.");
			}
		}

	}

	public static void menu() {
		System.out.println("\n--------------------------------------------------------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("--------------------------------------------------------------");
	}

	public static int checkInt(String str) {
		if ("".equals(str.replaceAll("[^0-9]", ""))) {
			System.out.println("정수로 입력해 주세요.\n입력> ");
			Scanner stdin = new Scanner(System.in);
			return checkInt(stdin.nextLine());
		}
		return Integer.parseInt(str.replaceAll("[^0-9]", ""));
	}

	public static int maxScores(int[] arr) {
		Arrays.sort(arr);
		int result = arr[arr.length - 1];
		return result;
	}

	public static int minScores(int[] arr) {
		Arrays.sort(arr);
		int result = arr[0];
		return result;
	}

	public static double avgScores(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return (double) sum / arr.length;
	}
}
