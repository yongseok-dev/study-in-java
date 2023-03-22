package ch05;

public class LoopFloatInt {
	public static void main(String[] args) {
		System.out.println("float\tint");
		System.out.println("----------------");
		int n = 0;
		float f = 0;
		for (int i = 0; i < 1000; i++) {
			f += 0.001;
			n += 1;
			System.out.println(f + "\t" + (float) n / 1000);
		}
	}
}
