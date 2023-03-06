package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		
		int sum1 = 0;
		for(int i : scores) {
			sum1+=i;
		}
		System.out.println(sum1+" "+(double)sum1/scores.length);
		printItem(scores);
	}
	public static void printItem(int[] scores) {
		for(int i=0; i<scores.length; i++) {
			System.out.println(i+" : "+scores[i]);
		}
	}

}
