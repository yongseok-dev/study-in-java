package basic_datastructure;

public class ArraySumForIn {
	public static void main(String[] args) {
		double[] a = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);;
		}
		
		double sum = 0;
		for (double d : a) {
			sum+=d;
		}
		System.out.println("sum: "+sum);
	}
}
