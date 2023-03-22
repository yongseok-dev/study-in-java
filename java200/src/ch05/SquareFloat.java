package ch05;

public class SquareFloat {
	public static void main(String[] args) {
		System.out.println("x\tx제곱");
		System.out.println("----------------");
		for (float f = 0; f <= 1; f += 0.001) {
			System.out.println(f + "\t" + f * f);
		}
	}
}
