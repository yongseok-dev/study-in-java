package ch04;

import userType.userTypeInteger;

/*
 * 숫자 맞추기 게인 범위를 0~99하고, 입력 횟수를 제한 하도록 프로그램을 수정
 * 제한 횟수 내에 맞추지 못한 경우에는 정답을 표시하고 게임을 종료
 * */
public class FindNumber {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 100);
		int count = 6;
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");

		while (count > 0) {
			int t = userTypeInteger.in("남은 횟수 " + count + "회, 어떤 숫자일까?: ");
			if (n == t) {
				System.out.println(count + "회만에 맞추었습니다.");
				break;
			} else if (n < t) {
				System.out.println("더 작은 숫자입니다.");
			} else {
				System.out.println("더 큰 숫자입니다.");
			}
			count--;
		}
		System.out.println("모든 기회를 소진했습니다.\n정답은 " + n + "입니다");
	}
}
