package ch02;

import java.util.Scanner;

public class RandomPlusMinnus5 {

	public static void main(String[] args) {
		// 키보드에서 입력한 정수값 +5 -5 범위의 랜덤 숫자 생성
		Scanner stdin = new Scanner(System.in);

		System.out.print("정수를 입력해 주세요");
		int a = stdin.nextInt();
		a += (int) (Math.random() * 11 - 5);
		System.out.print(a);
	}

}
