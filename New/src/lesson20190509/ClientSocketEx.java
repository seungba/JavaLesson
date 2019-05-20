package lesson20190509;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSocketEx {
	public static void main(String[] args)
			throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
		// get the localhost IP address, if server is running on some other IP, you need
		// to use that
		InetAddress host = InetAddress.getLocalHost();
		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("3 " + socket);
		
		// establish socket connection to server
//		socket = new Socket(host.getHostName(), 80);
		System.out.println("4 " + socket);
		socket = new Socket("localhost", 8080); // 여기서 소켓 포트가 바뀜
		// write to socket using ObjectOutputStream

		while (true) {
			
			System.out.println("5 " + socket);
			oos = new ObjectOutputStream(socket.getOutputStream());
			System.out.println("Sending request to Socket Server");

			System.out.print("입력하세요 : ");
			String sendMessage = sc.nextLine();
			oos.writeObject(sendMessage);

			// read the server response message
			ois = new ObjectInputStream(socket.getInputStream());
			String message = (String) ois.readObject();
			System.out.println("Message: " + message); // 서버에서 받은 메시지

			if (message == "exit") {
				break;
			}
		}

		// close resources
		ois.close();
		oos.close();
		Thread.sleep(100);
		System.out.println("6 " + socket);
	}
}