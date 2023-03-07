package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		String firstNum = ssn.split("-")[0];
		String secondNum = ssn.split("-")[1];
		System.out.println(firstNum);
		System.out.println(secondNum);

		firstNum = ssn.substring(0,6);
		secondNum = ssn.substring(7);
		System.out.println(firstNum);
		System.out.println(secondNum);

	}

}
