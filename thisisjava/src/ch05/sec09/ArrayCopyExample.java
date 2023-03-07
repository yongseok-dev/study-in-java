package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int[] oldArray = { 1, 2, 3, 4 };
		int[] newArray = new int[8];
		System.arraycopy(oldArray, 1, newArray, 1, 2);

		for (int i : newArray) {
			System.out.println(i);
		}

	}

}
