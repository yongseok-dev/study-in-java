package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 =15;
		if(v1>10) {
			int v2 = v1-10;
		}
//		int v3 = v1 + v2 + 5; //v2가 if스코프 내부에 선언되어 밖에서는 접근이 제한된다.

	}

}
