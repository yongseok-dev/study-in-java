package ch14.sec05;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread w1 = new WorkThread("A");
		WorkThread w2 = new WorkThread("B");
		w1.start();
		w2.start();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		w1.work = false;
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		w1.work = true;
	}
}
