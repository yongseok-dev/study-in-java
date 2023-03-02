package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.print("x: "+x+", y: "+y);

		System.out.print("\n x <-> y \n");
		int temp = x;
		x = y;
		y = temp;
		
		System.out.print("x: "+x+", y: "+y);
	}

}
