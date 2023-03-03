package ch02;

public class SumDiff {

	public static void main(String[] args) {
		// 정수 82와 17의 합과 차를 구하는 프로그램을 작성
		int number1 = 82;
		int number2 =17;
		
		System.out.println("합: "+(number1+number2));
		System.out.println("차: "+(number1-number2));
		//문자열 자동형변환 발생에 따른 ()사용
		

		System.out.println("소괄호 미사용");
		System.out.println("합: "+number1+number2);
//		System.out.println("차: "+number1-number2);
	}

}
