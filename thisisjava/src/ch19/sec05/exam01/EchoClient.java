package ch19.sec05.exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 50001);
			System.out.println("[client] connet");
			
			String sendMessage = "I like java";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[Client] data send"+sendMessage);
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String reciveMessage = dis.readUTF();
			System.out.println("[Client] data recive "+reciveMessage);
			
			
//			socket.close();
			System.out.println("[client] disconnet");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
