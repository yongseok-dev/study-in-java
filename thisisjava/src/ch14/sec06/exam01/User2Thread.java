package ch14.sec06.exam01;

import lombok.Setter;

@Setter
public class User2Thread extends Thread {
	private Calculator calculator;

	public User2Thread() {
		setName("User2T");
	}

	@Override
	public void run() {
		calculator.setMemory2(50);
	}
}
