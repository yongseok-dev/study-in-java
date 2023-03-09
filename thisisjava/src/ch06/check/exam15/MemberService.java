package ch06.check.exam15;

public class MemberService {
	private String name;
	private String id;
	private String password;
	private int age;

	MemberService() {
		this.name = "홍길동";
		this.id = "hong";
		this.password = "12345"; // 15번 초기 비밀번호
	}

	// 14번
	MemberService(String name, String id) {
		this.name = name;
		this.id = id;
	}

	// 15번
	public boolean login(String id, String password) {
		if (this.id.equals(id) && this.password.equals(password)) {
			return true;
		}
		return false;
	}

	public void logout(String id) {
		System.out.printf("%s님이 로그아웃 되었습니다.", id);
	}

}
