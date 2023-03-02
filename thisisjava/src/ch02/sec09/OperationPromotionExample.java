package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println("result1:" + result1);// 컴파일 단계에서 연산
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		System.out.println("result2:" + result2);// 실행 중 int로 형변환 후 연산

		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3+v4+v5;
		System.out.println("result3:" + result3);

		char v6 = 'A';
		int v7 = 5;
		int result4 = v6+v7;
		System.out.println("result4:" + result4);
		System.out.println("(char)result4:" + (char)result4);
		
		int v8 = 10;
		int result5 = v8/2;
		System.out.println("result5:" + result5);
		int result6 = v8/3;
		System.out.println("result6:" + result6);
		
		int v9 = 10;
		double result7 = v9/7;//int로 변환 후 계산후 double로 변환	
		System.out.println("result7:" + result7);
		
		int v10 = 1;
		int v11 = 2;
		double result8 = (double) v10/v11;//double로 변환 후 계산
		System.out.println("result8:" + result8);
	}
}
