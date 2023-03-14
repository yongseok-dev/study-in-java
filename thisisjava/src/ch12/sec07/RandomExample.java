package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(3);//씨드 값(->난수표)
		System.out.println("선택번호: ");
		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		int[] winnerNumber = new int[6];
		random = new Random(5);//씨드 값(->난수표)
		System.out.println("당첨번호: ");
		for (int i = 0; i < winnerNumber.length; i++) {
			winnerNumber[i] = random.nextInt(45)+1;
			System.out.print(winnerNumber[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(winnerNumber);
		
		boolean result = Arrays.equals(selectNumber, winnerNumber);
		System.out.println("당첨여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}
