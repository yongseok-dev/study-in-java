package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "9506241234567";
		String sex = ssn.charAt(6)%2==1?"남":"여";
		
		System.out.print(sex+"성 입니다.");

	}

}
