package ch12.sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// 박싱
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		// 언박싱
		int value = obj;
		System.out.println("value: " + value);

		// 연산 언박싱
		int result = obj + 100;
		System.out.println("result: " + result);

		// 박싱
		Object[] obj1 = { 100, 3.14, 'A', "ABC", new int[6] };
		// 언박싱
		System.out.println(obj1.toString());
		System.out.println(obj1[0]);
		System.out.println(obj1[0] instanceof Integer);
		System.out.println(obj1[1]);
		System.out.println(obj1[1] instanceof Integer);
		System.out.println(obj1[1] instanceof Float);
		System.out.println(obj1[1] instanceof Double);
	}
}
