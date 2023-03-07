package ch05.check;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		for (int[] i : array) {
			for (int j : i) {
				sum += j;
				count++;
			}
		}
		System.out.printf("합계: %d%n평균: %f",sum,(double)sum/count);
	}

}
