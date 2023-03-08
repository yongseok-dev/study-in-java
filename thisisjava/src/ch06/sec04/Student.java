package ch06.sec04;

public class Student {
	public static void main(String[] args) {
		Student sd = new Student();
		System.out.println(sd);
		System.out.println("sd 변수가 Student 객체를 참조합니다.");
		Student sd2 = new Student();
		System.out.println(sd2);
		System.out.println("sd2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
