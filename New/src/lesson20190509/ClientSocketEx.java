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
		while(true) {
			// establish socket connection to server
//			socket = new Socket(host.getHostName(), 80);
			
			socket = new Socket("localhost", 8080);
			// write to socket using ObjectOutputStream
			
			oos = new ObjectOutputStream(socket.getOutputStream());
			System.out.println("Sending request to Socket Server");
			
			System.out.print("입력하세요 : ");
			String sendMessage = sc.nextLine();
			oos.writeObject(sendMessage);
			
			// read the server response message
			ois = new ObjectInputStream(socket.getInputStream());
			String message = (String) ois.readObject();
			System.out.println("Message: " + message);
			// close resources
			ois.close();
			oos.close();
			Thread.sleep(100);
		}
	}
}