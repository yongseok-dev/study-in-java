package ch02;
import java.util.Scanner;

public class ScanInteger {

	public static void main(String[] args) {
		// 키보드에서 입력한 정숫값 표시
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력값 출력");
		System.out.println(scanner.next());
		System.out.println("정수 입력 값 출력");
		System.out.println(scanner.nextInt());

		//표준 입력 스트임
	}

}
