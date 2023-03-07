package ch03;

public class FingerFlashing {

	public static void main(String[] args) {
		// 0,1,2 중 하나의 난수 생성 0 가위 1 바위 2 보 출력
		int i = (int) (Math.random() * 3);
		String[] finger = { "가위", "바위", "보" };
//		System.out.println(finger[i]);
		switch (i) {
		case 0:
			System.out.println(finger[0]);
			break;
		case 1:
			System.out.println(finger[1]);
			break;
		case 2:
			System.out.println(finger[2]);
			break;
		}
	}

}
