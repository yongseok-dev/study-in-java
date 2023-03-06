package ch05.sec07;

public class MulitdimensionalArrayByNewExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "]: " + mathScores[i][j]);
			}
		}
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		int studentCount = 0;
		int mathSum = 0;
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				studentCount++;
				mathSum += mathScores[i][j];
			}
		}
		System.out.println("합계: " + mathSum);
		System.out.println("평균: " + (double)mathSum/studentCount);
		
	}

}
