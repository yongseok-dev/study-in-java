package ch07;

import userType.UserType;

public class AryRmvN {
	private static int[] arrayRemoved(int[] array, int index, int count) {
		for (int i = index; i < array.length - count; i++) {
			array[i] = array[i + count];
		}
		return array;
	}

	public static void main(String[] args) {
		int n = UserType.i("요소 수: ", "+");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = UserType.i("arr[" + i + "]: ");
		}
		
		int rStart = -1;
		do {
			rStart= UserType.i("삭제할 요소의 인덱스: ","0+");
		} while (!(rStart>= 0 && rStart< n));
		int rCount = 1;
		do {
			rCount= UserType.i("삭제할 요소의 개수: ","+");
		} while (!(rStart+rCount <= n));
		int[] removedArr = arrayRemoved(arr, rStart,rCount);
		
		for (int i = 0; i < removedArr.length; i++) {
			System.out.println("arr[" + i + "]: " + removedArr[i]);
		}
	}
}
