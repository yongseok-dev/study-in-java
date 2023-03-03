package ch04.sec05;

public class PrintFormExample {

	public static void main(String[] args) {
		int i = 1;
		while(i<11) {
			System.out.print(i++ + " ");
		}
		
		System.out.println();
		int j = 1;
		int sum = 0;
		while(j<=100) {
			sum+=(j++);
		}
		System.out.println(sum);
	}

}
