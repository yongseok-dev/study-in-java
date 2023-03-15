package ch13.sec03;

public class GenericExample {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100);
		int intValue = box1.getT();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("test");
		System.out.println(box2.getT());
	}
}
