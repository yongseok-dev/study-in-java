package ch13.sec02.exam3;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "hi~";
		System.out.println(box1.content);
		
		Box<String> box2 = new Box<>();
		box2.content = "hi~";
		System.out.println(box2.content);
		
		Box<Integer> box3 = new Box<>();
		box3.content = 1004;
		System.out.println(box3.content);

		Box<Integer> box4 = new Box<>();
		box4.content = 1004;
		System.out.println(box4.content);

		Box<Integer> box5 = new Box<>();
		box5.content = 1005;
		System.out.println(box5.content);
		
		System.out.println(box1.compare(box2));
		System.out.println(box3.compare(box4));
		System.out.println(box4.compare(box5));
	}
}
