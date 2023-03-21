package ch19.sec03.exam01;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
	private static ServerSocket serverSocket = null;

	public static void main(String[] args) {
		System.out.println("-------------------------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("-------------------------------------------------------------");

		startServer();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			String key = scanner.nextLine();
			if (key.toLowerCase().equals("q"))
				break;
		}
		scanner.close();
		stopServer();
	}

	public static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[server] stop");
		} catch (Exception e) {
		}

	}

	public static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(50001);
					System.out.println("[server] start");

					while (true) {
						System.out.println("\n[server] connetion waitting\n");
						Socket socket = serverSocket.accept();

						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[server] " + isa.getHostName() + " connect");

						socket.close();
						System.out.println("[server] " + isa.getHostName() + " disconnect");

					}

				} catch (Exception e) {
					System.out.println("[server] " + e.getMessage());
				}
			}

		};
		thread.start();
	}

}
