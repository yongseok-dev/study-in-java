package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "hi~";
		System.out.println(box1.content);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 1004;
		System.out.println(box2.content);
	}
}
