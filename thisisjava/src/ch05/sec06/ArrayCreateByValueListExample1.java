package ch05.sec06;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		String[] season = { "Spting", "Summer", "Fall", "Winter" };
		System.out.println("season[0]: " + season[0]);
		System.out.println("season[1]: " + season[1]);
		System.out.println("season[2]: " + season[2]);
		System.out.println("season[3]: " + season[3]);

		season[1] = "여름";
		for (String i : season) {
			System.out.println(i);
		}

		int[] scores = { 83, 90, 87 };

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("sum: "+sum);
		System.out.println("avg: "+(double)sum/3);
	}

}
