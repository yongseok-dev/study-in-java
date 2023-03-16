package ch16.sec04;

public class LambdaExample {
	public static void main(String[] args) {
		Person ps = new Person();

		ps.action((x, y) -> {
			return x + y;
		});
		ps.action((x, y) -> x-y);
	}
}
