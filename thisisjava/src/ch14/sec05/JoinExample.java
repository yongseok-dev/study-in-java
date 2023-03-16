package ch14.sec05;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sT = new SumThread();
		sT.start();
		try {
			sT.join();//끝나고 다음으로 넘어감
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(sT.getSum());
		System.out.println(sT.getSum());
	}
}
