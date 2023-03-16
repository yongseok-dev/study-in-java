package ch16.sec02.exam01;

public class LambdaExample {
public static void main(String[] args) {
	Person person = new Person();
	
	person.action(()->{
		System.out.println("출근");
		System.out.println("프로그래밍");
	});
	
	person.action(()->System.out.println("퇴근"));
}
}
