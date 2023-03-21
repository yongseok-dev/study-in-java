package ch19.sec03.exam01;

import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 50001);
			System.out.println("[client] connet");
			socket.close();
			System.out.println("[client] disconnet");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
