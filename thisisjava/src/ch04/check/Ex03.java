package ch04.check;

public class Ex03 {
	public static void main(String[] args) {
		int answer = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				answer += i;
		}
		System.out.print(answer);
	}
}
