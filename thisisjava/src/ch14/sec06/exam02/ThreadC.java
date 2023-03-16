package ch14.sec06.exam02;

public class ThreadC extends Thread {
	private WorkObject wo;

	public ThreadC(WorkObject wo) {
		setName("ThreadC");
		this.wo = wo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			wo.methodC();
		}
	}
}
