package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer com = new Computer();
		
		System.out.println(com.sum(1));
		System.out.println(com.sum(1,2,3));
		System.out.println(com.sum(1,2,3,4,5));
//		System.out.println(com.sum(1,2,3,4,5,"a")); // 잘못된 타입이 들어감...
		
		int[] values = new int[] {1,2,3,4,5};
		System.out.println(com.sum(values));
		System.out.println(com.sum(new int[] {1,2,3,4,5}));
	}

}
