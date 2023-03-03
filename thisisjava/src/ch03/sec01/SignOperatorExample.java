package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println(x);
		
		int y = 100;
		y = -y;
		System.out.println(y);

		int count  = 1;
		System.out.println(count++); // 1
		System.out.println(++count); // 3
	}

}
