package ch16.sec05.exam03;

public class Person {
	public Member getMember1(Creatable1 ct) {
		String id = "winter";
		Member member = ct.create(id);
		return member;
	}

	public Member getMember2(Creatable2 ct) {
		String id = "winter";
		String name = "두겨울";
		Member member = ct.create(id, name);
		return member;
	}
}
