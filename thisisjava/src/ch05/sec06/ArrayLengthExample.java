package ch05.sec06;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 84, 90, 96 };
		int sum = 0;
		for(int i = 0 ; scores.length>i; i++) {
			sum+=scores[i];
		}
		
		System.out.println(sum);
		System.out.println((double)sum/scores.length);

	}

}
