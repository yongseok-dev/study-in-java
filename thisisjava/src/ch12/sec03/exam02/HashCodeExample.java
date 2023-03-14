package ch12.sec03.exam02;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("동등객체 입니다.");
			}else {
				System.out.println("데이터가 다름");
			}
		}else {
			System.out.println("헤시코드가 데이터가 다름");
		}
	}
}
