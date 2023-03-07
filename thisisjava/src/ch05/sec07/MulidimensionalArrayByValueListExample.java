package ch05.sec07;

public class MulidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };
		System.out.println("1차원: " + scores.length);
		System.out.println("2차원1: " + scores[0].length);
		System.out.println("2차원2: " + scores[1].length);

		System.out.println("scores[0][0]: " + scores[0][0]);
		System.out.println("scores[0][1]: " + scores[0][1]);
		System.out.println("scores[0][2]: " + scores[0][2]);
		System.out.println("scores[1][0]: " + scores[1][0]);
		System.out.println("scores[1][1]: " + scores[1][1]);

		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		System.out.println("class1Sum: " + class1Sum);
		System.out.println("class1avg: " + (double)class1Sum/scores[0].length);
		int class2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		System.out.println("class2Sum: " + class2Sum);
		System.out.println("class2avg: " + (double)class2Sum/scores[1].length);
		
		int classSum = 0;
		int count = 0;
		for (int[] i : scores) {
			for(int j : i) {
				classSum+=j;
				count++;
			}
		}
		System.out.println("classSum: " + classSum);
		System.out.println("classAvg: " + (double)classSum/count);
		
		
	}

}
