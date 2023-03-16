package ch14.sec06.exam02;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject wo = new WorkObject();
		
		ThreadA ta = new ThreadA(wo);
		ThreadB tb = new ThreadB(wo);
		ThreadC tc = new ThreadC(wo);
		
		ta.start();
		tb.start();
		tc.start();
	}
}
