package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
	public static void main(String[] args) {
		String[][] mails = new String[1000][3];
		for (int i = 0; i < mails.length; i++) {
			mails[i][0] = "admin@test.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품 입고";
		}
		ExecutorService es = Executors.newFixedThreadPool(5);

		for (int i = 0; i < mails.length; i++) {
			final int idx = i;
			es.execute(new Runnable() {
				@Override
				public void run() {
					Thread t = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + t.getName() + "]" + from + " ==> " + to + ": " + content);
				}
			});
		}
		es.shutdown();
	}
}
