package ch14.sec06.exam01;

import lombok.Setter;

@Setter
public class User1Thread extends Thread {
	private Calculator calculator;

	public User1Thread() {
		setName("User1T");
	}

	@Override
	public void run() {
		calculator.setMemory1(100);
	}
}
