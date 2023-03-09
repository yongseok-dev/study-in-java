package ch06.check.exam15;

public class MemberExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();

		boolean isLogin = memberService.login("hong", "12345");
//		boolean isLogin = memberService.login("hong", "1234");
		
		
		if (isLogin) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id password가 올바르지 않습니다.");
		}

	}

}
