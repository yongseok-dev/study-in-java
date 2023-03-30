package userType;

public class CreateArray {
	public int[] createArrayI(int n, int max) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * max + 1);
		}
		return arr;
	}
}
