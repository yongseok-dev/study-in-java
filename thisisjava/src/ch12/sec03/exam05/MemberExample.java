package ch12.sec03.exam05;

public class MemberExample {
	public static void main(String[] args) {
		Member member1 = new Member();
		member1.setAge(10);
		member1.setId("abc");
		member1.setName("김자바");
		Member member2 = new Member("bcd","이자바",9);
		Member member3 = new Member();
		
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		
	}
}
