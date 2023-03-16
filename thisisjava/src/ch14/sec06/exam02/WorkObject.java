package ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+": methodA run");
		notify();
		try {
			wait();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public synchronized void methodB() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+": methodB run");
		notify();
		try {
			wait();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public synchronized void methodC() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+": methodB run");
	}
}
