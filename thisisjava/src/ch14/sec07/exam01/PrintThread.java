package ch14.sec07.exam01;

import lombok.Setter;

@Setter
public class PrintThread extends Thread {
	private boolean stop;

	@Override
	public void run() {
		while (!stop) {
			System.out.println("running");
		}
		System.out.println("resource clean");
		System.out.println("end");
	}
}
