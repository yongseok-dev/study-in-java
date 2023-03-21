package ch19.sec05.exam02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------");
		System.out.println("서버를 종료하면 q를 입력하고 Enter키를 입력하세요.");
		System.out.println("----------------------------------------------------");

		startServer();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			String key = scanner.nextLine();
			if (key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		stopServer();
	}

	public static void stopServer() {
		datagramSocket.close();
		executorService.shutdownNow();
		System.out.println("[server] stop");

	}

	public static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {

				try {
					datagramSocket = new DatagramSocket(50001);
					System.out.println("[server] start");
					while (true) {
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						datagramSocket.receive(receivePacket);

						executorService.execute(() -> {
							try {
								String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(),
										"UTF-8");

								SocketAddress socketAddress = receivePacket.getSocketAddress();
								for (int i = 1; i <= 10; i++) {
									String data = newsKind + ": 뉴스" + i;
									byte[] bytes = data.getBytes("UTF-8");
									DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length,
											socketAddress);
									datagramSocket.send(sendPacket);

								}
							} catch (Exception e) {
								// TODO: handle exception
							}
						});

					}
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		};
		thread.start();
	}
}
