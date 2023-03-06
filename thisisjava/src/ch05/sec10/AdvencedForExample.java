package ch05.sec10;

public class AdvencedForExample {

	public static void main(String[] args) {
		int[] array = { 95, 11, 84, 93, 87 };
		int sum = 0;
		for (int i : array) {
			sum += i;
//			System.out.println(i);
		}
		System.out.println("sum>");
		System.out.println(sum);
		System.out.println("avg>");
		System.out.println((double)sum/array.length);

	}

}
