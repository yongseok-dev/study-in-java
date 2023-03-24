package ch07;

import userType.UserType;

public class AryRmv {
	private static int[] arrayRemoved(int[] array, int index) {
		for (int i = index; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		return array;
	}

	public static void main(String[] args) {
		int n = UserType.i("요소 수: ", "+");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = UserType.i("arr[" + i + "]: ");
		}
		
		int remove = -1;
		do {
			remove = UserType.i("삭제할 요소의 인덱스: ");
		} while (!(remove >= 0 && remove < n));
		int[] removedArr = arrayRemoved(arr, remove);
		
		for (int i = 0; i < removedArr.length; i++) {
			System.out.println("arr[" + i + "]: " + removedArr[i]);
		}
	}
}
