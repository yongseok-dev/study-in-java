package ch14.sec07.exam01;

public class SafeStopExample {
	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		pt.start();
		
		try {
			Thread.sleep(3000);
//			pt.sleep(2500);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		pt.setStop(true);
	}
}
