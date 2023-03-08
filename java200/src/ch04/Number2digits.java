package ch04;

import java.util.Scanner;

public class Number2digits {

	public static void main(String[] args) {
		// 2자리 정수를 맞추는 숫자 게임을 만들기
		// 난수 생성과 if, do 문을 사용.

		Scanner sn = new Scanner(System.in);
		int number = (int) (Math.random() * 90) + 10;
//		System.out.println("번호: " + number);
		
		int type;
		do {
			System.out.println("2자리 번호를 입력해보세요.");
			type = sn.nextInt();
			if (type == number) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("정답이 아닙니다." + (type < number ? "up" : "down"));
			}
		} while (type != number);

	}

}
