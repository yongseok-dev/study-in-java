package ch14.sec07.exam02;

public class PrintThread extends Thread {
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("running");
				Thread.sleep(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("resource clean");
		System.out.println("end");
	}
}
