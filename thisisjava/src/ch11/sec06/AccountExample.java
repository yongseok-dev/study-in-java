package ch11.sec06;

public class AccountExample {
	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.deposit(10000);
		System.out.println("예금액"+ acc.getBalance());
		
		try {
			acc.withdraw(30000); //Unhandled exception type InsufficientException
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
