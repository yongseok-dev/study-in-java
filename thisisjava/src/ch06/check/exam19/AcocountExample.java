package ch06.check.exam19;

public class AcocountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		System.out.println("초기값"+account.getBalance());
		account.setBalance(10000);
		System.out.println("현재잔고"+account.getBalance());
		account.setBalance(-100);
		System.out.println("현재잔고"+account.getBalance());
		account.setBalance(2000000);
		System.out.println("현재잔고"+account.getBalance());
		account.setBalance(300000);
		System.out.println("현재잔고"+account.getBalance());
	}

}
