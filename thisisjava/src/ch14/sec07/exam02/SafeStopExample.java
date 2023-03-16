package ch14.sec07.exam02;

public class SafeStopExample {
	public static void main(String[] args) {
		Thread pt = new PrintThread();
		pt.start(); //run() 실행
//		System.out.println(Thread.getName());
		try {
			Thread.sleep(1000);
//			pt.sleep(2500);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		pt.interrupt();
	}
}
