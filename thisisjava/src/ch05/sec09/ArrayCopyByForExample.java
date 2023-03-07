package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] ordIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		for (int i = 0; i < ordIntArray.length; i++) {
			newIntArray[i] = ordIntArray[i];
		}
		for (int i : newIntArray) {
			System.out.println(i);
		}
	}

}
