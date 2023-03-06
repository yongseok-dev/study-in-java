package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;

		arr1 = new int[] { 1, 2, 3 };
		arr2 = new int[] { 1, 2, 3 };
		arr3 = arr2;
		
		System.out.println(arr1==arr2);
		System.out.println(arr1[1]==arr2[1]);
		System.out.println(arr3==arr2);
		
		arr3[1] = 3;
		System.out.println(arr2[1]);
		arr3 = null;
//		System.out.println(arr3[0]+arr3[1]+arr3[2]);		
		System.out.println(arr2[0]+arr2[1]+arr2[2]);		
		
	}

}
