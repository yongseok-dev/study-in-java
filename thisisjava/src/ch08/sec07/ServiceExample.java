package ch08.sec07;

public class ServiceExample {
	public static void main(String[] args) {
		Service service = new ServiceImpl();

		service.defaulMethod1();
		System.out.println();
		service.defaulMethod2();
		System.out.println();
		
//		service.staticMethod1(); // 실행불가.
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}
}
