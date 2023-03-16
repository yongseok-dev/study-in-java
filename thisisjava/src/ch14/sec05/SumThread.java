package ch14.sec05;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SumThread extends Thread {
	private long sum;
	@Override
	public void run() {
		System.out.println("run start");
		for (int i = 0; i <= 100; i++) {
			sum+=i;
		}
		System.out.println("run end");
	}
}
