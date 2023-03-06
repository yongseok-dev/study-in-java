package ch05.sec05;

public class Rename {

	public static void main(String[] args) {
		String fileName = "안녕하세요.xml";
		String time = "" + System.currentTimeMillis();

		// 분해
		String[] names = fileName.split("[.]");
//		System.out.print(names.length);
		if (names.length == 2) {
			// 출력
			System.out.println(time + "." + names[1]);
		} else {
			System.out.println("파일명에 .가 2번 들어갈 수 없습니다.");
		}

	}

}
