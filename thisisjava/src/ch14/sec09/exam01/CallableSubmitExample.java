package ch14.sec09.exam01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		for (int i = 1; i <= 100; i++) {
			final int idx = i;
			Future<Integer> future = es.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int j = 1; j <= idx; j++) {
						sum += j;
					}
					Thread t = Thread.currentThread();
					System.out.printf("[%s] 1~%d sum cal%n", t.getName(), idx);
					return sum;
				}
			});
			try {
				int result = future.get();
				System.out.println("\t리턴값: " + result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		es.shutdown();
	}
}
