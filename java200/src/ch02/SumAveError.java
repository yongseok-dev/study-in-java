package ch02;

public class SumAveError {

	public static void main(String[] args) {
		// 2개의 변수 x와 y의 합과 평균을 표시
//		int x = 5.5;// int에는 실수값을 저장할 수 없음!!
//		int y = 35.1;
		
		double x,y;
		x= 5.5;
		y = 35.1;
		
		
		System.out.println("sum: " + (x+y));
		System.out.println("avg: " + (x+y)/2);		
	}

}
