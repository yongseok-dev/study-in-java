package ch19.sec02;

import java.net.InetAddress;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("my IP :"+local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : iaArr) {
				System.out.println("naver IP : "+remote.getHostAddress());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
