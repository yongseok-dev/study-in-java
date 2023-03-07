package ch03;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// 월을 1~12의 정수로 입력시 계절을 표시하는 프로그램 작성
		Scanner sn = new Scanner(System.in);
		System.out.println("월>");
		int month = sn.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("올바른 월을 넣어주세요");
			break;
		}
	}

}
