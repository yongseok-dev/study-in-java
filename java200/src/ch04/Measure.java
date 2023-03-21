package ch04;

import userType.userTypeInteger;

//입력한 정숫 값의 모든 약수와 그 개수를 표시하는 프로그램을 작성하자.
public class Measure {
	public static void main(String[] args) {
		int n = userTypeInteger.in("정숫값: ");
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				System.out.print(i+ " ");
				count++;
			}
		}
		System.out.println("의 약수는 "+count+"개 입니다.");
	}
}
