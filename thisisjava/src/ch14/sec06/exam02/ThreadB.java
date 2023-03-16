package ch14.sec06.exam02;

public class ThreadB extends Thread {
	private WorkObject wo;

	public ThreadB(WorkObject wo) {
		setName("ThreadB");
		this.wo = wo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			wo.methodB();
		}
	}
}
