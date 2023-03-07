package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1 [" + i + "]: " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1 [" + i + "]: " + arr1[i]);
		}

		System.out.println();

		double[] arr2;
		arr2 = new double[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2 [" + i + "]: " + arr2[i]);
		}
		arr2[0] = 10.5;
		arr2[1] = 20.5;
		arr2[2] = 30.5;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2 [" + i + "]: " + arr2[i]);
		}

	}

}
