package ch14.sec06.exam02;

public class ThreadA extends Thread {
	private WorkObject wo;

	public ThreadA(WorkObject wo) {
		setName("ThreadA");
		this.wo = wo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			wo.methodA();
		}
	}
}
